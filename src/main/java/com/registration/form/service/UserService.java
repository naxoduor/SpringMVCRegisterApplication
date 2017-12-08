/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registration.form.service;

/**
 *
 * @author maradona
 */
import java.util.List;
import com.registration.form.model.User;

public interface UserService {
    
    User findById(Integer id);
    
    List<User> findAll();
    
    void saveOrUpdate(User user);
    
    void delete(int id);
    
}
