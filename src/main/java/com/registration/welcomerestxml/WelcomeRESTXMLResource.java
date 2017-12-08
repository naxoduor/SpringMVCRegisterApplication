/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registration.welcomerestxml;

/**
 *
 * @author maradona
 */
import java.io.StringWriter;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXB;

@Path( "welcome" )
public class WelcomeRESTXMLResource {
    
    @GET
    @Path( "{name}" )
    @Produces( "application/xml" )
    public String getXml( @PathParam( "name" ) String name) {
    
        String message = "welcome to JAX-RS web services with REST and"
                + "XML, " + name + "|";
        StringWriter writer = new StringWriter();
        JAXB.marshal(message, writer);
        return writer.toString();
    }
}
