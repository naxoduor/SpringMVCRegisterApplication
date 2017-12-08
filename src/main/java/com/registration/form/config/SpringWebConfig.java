/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registration.form.config;

/**
 *
 * @author maradona
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan({ "com.registration.form.web", "com.registration.form.service", "com.registration.form.dao",
        "com.registration.form.exception", "com.registration.form.validator"})
public class SpringWebConfig extends WebMvcConfigurerAdapter {
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
    
    @Bean
    public InternalResourceViewResolver viewResolver() {
    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    viewResolver.setViewClass(JstlView.class);
    viewResolver.setPrefix("/WEB-INF/views/");
    viewResolver.setSuffix(".jsp");
    return viewResolver;
    }
    
    @Bean
    public ResourceBundleMessageSource messageSource() {
    ResourceBundleMessageSource rb = new ResourceBundleMessageSource();
    rb.setBasenames(new String[] {"messages/messages", "messages/validation"});
    return rb;
    }
    
}
