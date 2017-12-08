/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registration.form.dao;

/**
 *
 * @author maradona
 */
import java.util.List;

import com.registration.form.model.User;
public interface UserDao {
    
    User findById(Integer id);
    
    List<User> findAll();
    
    void save(User user);
    
    void update(User user);
    
    void delete(Integer id);
    
}
