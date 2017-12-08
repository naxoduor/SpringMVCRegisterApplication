<%-- 
    Document   : header
    Created on : Dec 19, 2017, 6:37:28 AM
    Author     : maradona
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC Form Handling Example</title>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <spring:url value="/" var="urlHome" />
        <spring:url value="/users/add" var="urlAddUser" />
        
        <nav class="navbar navabar-inverse">
            <div class="container">
                <div class="navbar-header">
                    <a class="navbar-brand" href="${urlHome}">Spring MVC Form</a>
                    
                </div>
                    <div id="navbar">
                        <ul class="nav navbar-nav navbar-right">
                            <li class="active"><a href="${urlAddUser}">Add User</a></li>
                            
                        </ul>
                        
                    </div>
            </div>
        </nav>
    </body>
</html>
