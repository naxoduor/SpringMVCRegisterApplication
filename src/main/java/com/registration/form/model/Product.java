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
public class Product {
    
    String name;
    
    int quantity;
    
    public void setName(String name) {
    this.name = name;
    }
    
    public String getName() {
    return name;
    }
    
    public void setQty(int quantity) {
    this.quantity = quantity;
    }
    
    public int getQty() {
    return quantity;
    }
    
}
