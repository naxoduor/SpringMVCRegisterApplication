/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registration.form.web;

/**
 *
 * @author maradona
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.registration.form.model.User;
import com.registration.form.service.UserService;
import com.registration.form.validator.UserFormValidator;

@Controller
public class UserController {
    
    private final Logger logger = LoggerFactory.getLogger(UserController.class);
    
    @Autowired
    private UserService userService;
    
    @Autowired
    UserFormValidator userFormValidator;
    
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
    binder.setValidator(new UserFormValidator());
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
    model.addAttribute("message", "Spring MVC XML Config Example");
    logger.debug("index()");
    return "redirect:/users";
            }
    
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String showAllUsers(Model model) {
    
        logger.debug("showAllUsers()");
        model.addAttribute("users", userService.findAll());
        return "list";
    }
    
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String saveOrUpdateUser(@ModelAttribute("userForm")User user, Model model, final RedirectAttributes redirectAttributes) {
        
    
        logger.debug("saveOrUpdateUser() : {}", user);
        
        /*if (result.hasErrors()) {
        populateDefaultModel(model);
        return "userform";
        } else {*/
            redirectAttributes.addFlashAttribute("css", "success");
            if(user.isNew()) {
                redirectAttributes.addFlashAttribute("msg", "user added successfully!");
            } else {
            redirectAttributes.addFlashAttribute("msg", "user updated successfully");
            }
            
            
            userService.saveOrUpdate(user);
            
            model.addAttribute("user", userService.findById(user.getId()));
            
            
            return "show";
        
    }
    
    @RequestMapping(value = "/users/add", method = RequestMethod.GET)
    public String showAddUserForm(Model model) {
    
        logger.debug("showAddUserForm()");
        
        User user = new User();
        user.setName("oduornax");
        user.setEmail("test@gmail.com");
        user.setAddress("abc 88");
        user.setNewsletter(true);
        user.setSex("M");
        user.setFramework(new ArrayList<String>(Arrays.asList("Spring MVC", "GWT")));
        user.setSkill(new ArrayList<String>(Arrays.asList("Spring", "Grails", "Groovy")));
        user.setCountry("SG");
        user.setNumber(2);
        model.addAttribute("userForm", user);
        model.addAttribute("message", "Spring MVC XML Config Example");
        
        populateDefaultModel(model);
        
        return "userform";
    }
    
    @RequestMapping(value="/users/{id}/update", method=RequestMethod.GET)
    public String showUpdateUserForm(@PathVariable("id") int id, Model model) {
    
        logger.debug("showUpdateUserForm() : {}", id);
        
        User user = userService.findById(id);
        model.addAttribute("userForm", user);
        
        populateDefaultModel(model);
        
        return "userform";
    }
    
    @RequestMapping(value="/users/{id}/delete", method = RequestMethod.POST)
    public String deleteUser(@PathVariable("id") int id, final RedirectAttributes redirectAttributes) {
    
        logger.debug("deleteUser() : {}", id);
        userService.delete(id);
        
        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", "User is deleted");
        
        return "users";
    }
    
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public String showUser(@PathVariable("id") int id, Model model) {
    
        logger.debug("showuser() i>d: {}", id);
        
        User user = userService.findById(id);
        if (user==null) {
        model.addAttribute("css", "danger");
        model.addAttribute("msg", "user not found");
        }
        
        model.addAttribute("user", user);
        return "show";
    }
    
    private void populateDefaultModel(Model model) {
    List<String> frameworkList = new ArrayList<String>();
    frameworkList.add("Spring MVC");
    frameworkList.add("Struts 2");
    frameworkList.add("JSF 2");
    frameworkList.add("GWT");
    frameworkList.add("Play");
    frameworkList.add("Apache Wicket");
    model.addAttribute("frameworkList", frameworkList);
    
    Map<String, String> skill = new LinkedHashMap<String, String>();
    skill.put("Hibernate", "Hibernate");
    skill.put("Spring", "Spring");
    skill.put("Struts", "Struts");
    skill.put("Groovy", "Groovy");
    skill.put("Grails", "Grails");
    model.addAttribute("javaSkillList", skill);
    
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    model.addAttribute("numberList", numbers);
    
    Map<String, String> country = new LinkedHashMap<String, String>();
    country.put("US", "United States");
    country.put("CN", "China");
    country.put("SG", "Singapore");
    country.put("MY", "Malaysia");
    model.addAttribute("countryList", country);
    }
    
}
