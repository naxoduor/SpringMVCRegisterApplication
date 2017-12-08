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
import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path( "welcome" )
public class WelcomeRESTJSONResource {
    @GET
    @Path( "{name}" )
    @Produces( "application/json" )
    public String getJson( @PathParam( "name" ) String name )
    {
    TextMessage message = new TextMessage();
    message.setMessage(String.format("%s, %s!", "Welcome to JAX-RS web services with REST and JSON", name) );
    
    return new Gson().toJson( message );
    }
}

class TextMessage
{
    private String message;
    
    public String getMessage()
    {
        return message;
    }
    
    public void setMessage(String value)
    {
    message = value;
    }
}