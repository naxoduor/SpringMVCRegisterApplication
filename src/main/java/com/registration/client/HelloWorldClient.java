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
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.registration.ws.HelloWorld;

public class HelloWorldClient {
    
    public static void main(String[] args) throws Exception {
    
       /* URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        
        QName qname = new QName("http://ws.mkyong.com/", "HelloWorldImplService");
        
        Service service = Service.create(url, qname);
        
        HelloWorld hello = service.getPort(HelloWorld.class);
        
        System.out.println(hello.getHelloWorldAsString("Nax Oduor Maradona"));*/
    }
    
}
