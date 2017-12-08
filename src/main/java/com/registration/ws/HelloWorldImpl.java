/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registration.ws;

/**
 *
 * @author maradona
 */
import javax.jws.WebService;

@WebService(endpointInterface = "com.mkyong.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    
    @Override
    public String getHelloWorldAsString(String name) {
    return "Hello World JAX-WS " + name;
    }
    
}
