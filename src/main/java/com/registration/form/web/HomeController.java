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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
//@RequestMapping("/nnn")
public class HomeController {
    
 //@RequestMapping(method = RequestMethod.GET)
  @RequestMapping(value = "/nnn", method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("message", "Spring MVC XML Config Example");
        return "nnnn";
    }

}

