/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registration.welcomerestjsonclient;

/**
 *
 * @author maradona
 */
import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.JOptionPane;

public class WelcomeRESTJSONClientJFrame extends javax.swing.JFrame {
    /*
    public WelcomeRESTJSONClientJFrame()
    {
    //initComponents();
    }
    
    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
    String name = nameJTextField.getText();
    
    
    try
    {
        String url = "http://localhost:8080/WelcomeRESTJSON/"
                + "resources/welcome/" + name;
        
        InputStreamReader reader = new InputStreamReader( new URL( url ).openStream() );
        
        TextMessage message = new Gson().fromJson(reader, TextMessage.class);
        
        JOptionPane.showMessageDialog(this, message.getMessage(), 
                "Welcome", JOptionPane.INFORMATION_MESSAGE);
}
    catch(Exception exception) 
    {
    exception.printStackTrace();
    }
    
    }
    
    public static void main(String args[])
    {
    java.awt.EventQueue.invokeLater(
    new Runnable()
    {
    public void run()
    {
    new WelcomeRESTJSONClientJFrame().setVisible( true );
    }
            }
    );
    
    }
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JButton submitJButton;*/
}

class TextMessage
{
private String message;

public String getMessage() 
{
    return message;
}

public void setMessage(String value) {
message = value;
}
}