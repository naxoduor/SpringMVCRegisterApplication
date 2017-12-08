/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registration.welcomerestjson;

/**
 *
 * @author maradona
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.registration.form.model.Product;

@Path("/json/product")
public class JSONService {
    
    @GET
    @Path("/get")
    @Produces("application/json")
    public Product getProductInJson() {
    
        Product product = new Product();
        product.setName("ipad 3");
        product.setQty(999);
        
        return product;
    }
    
}
