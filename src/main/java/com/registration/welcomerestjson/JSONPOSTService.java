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
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;

import com.registration.form.model.Product;

@Path("/json/product")
public class JSONPOSTService {
    
    @POST
    @Path("/post")
    @Consumes("application/json")
    public Response createProductInJson(Product product) {
        
        String result = "Product created : " + product;
        return Response.status(201).entity(result).build();
    }
    
}
