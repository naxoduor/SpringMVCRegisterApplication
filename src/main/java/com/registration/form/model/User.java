/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registration.form.model;

/**
 *
 * @author maradona
 */
import java.util.List;
public class User {
    
    Integer id;
    
    String name;
    
    String email;
    
    String address;
    
    String password;
    
    String confirmPassword;
    
    boolean newsletter;
    
    List<String> framework;
    
    String sex;
    
    Integer number;
    
    String country;
    
    List<String> skill;
    
    public boolean isNew() {
    return (this.id == null);
    }
    
    public boolean isNewsletter() {
    return newsletter;
    }
    
    public Integer getId() {
    return id;
    }
    
    public void setId(Integer id) {
    this.id= id;
    }
    
    public String getName() {
    return name;
    }
    
    public void setName(String name) {
    this.name=name;
    }
    
    public String getEmail() {
    return email;
    }
    
    public void setEmail(String email) {
    this.email=email;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
    this.address= address;
    }
    
    public String getPassword() {
    return password;
    }
    
    public void setPassword(String password) {
    this.password=password;
    }
    
    public String getConfirmPassword() {
    return confirmPassword;
    }
    
    public void getConfirmPassword(String confirmPassword) {
    this.confirmPassword=confirmPassword;
    }
    
    public boolean getNewsLetter() {
    return newsletter;
    }
    
    public void setNewsletter(boolean newsletter) {
    this.newsletter=newsletter;
    }
    
    public List<String> getFramework() {
    return framework;
    }  
    
    public void setFramework(List<String> framework) {
    this.framework=framework;
    }
    
    public String getSex() {
    return sex;
    }
    
    public void setSex(String sex) {
    this.sex=sex;
    }
    
    public Integer getNumber() {
    return number;
    }
    
    public void setNumber(Integer number) {
    this.number=number;
    }
    
    public String getCountry() {
    return country;
    }
    
    public void setCountry(String country) {
    this.country=country;
    }
    
    public List<String> getSkill() {
    return skill;
    }
    
    public void setSkill(List<String> skill) {
    this.skill=skill;
    }
}
