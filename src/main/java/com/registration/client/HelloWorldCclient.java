/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registration.client;

/**
 *
 * @author maradona
 */
import com.registration.ws.HelloWorld;
import com.registration.ws.HelloWorldImplService;
public class HelloWorldCclient {
    
    public static void main(String[] args) {
    
        HelloWorldImplService helloService = new HelloWorldImplService();
        HelloWorld hello = helloService.getHelloWorldImplPort();
        
        System.out.println(hello.getHelloWorldAsString("Maradona Nax Oduor Ochieng"));
    }
}
