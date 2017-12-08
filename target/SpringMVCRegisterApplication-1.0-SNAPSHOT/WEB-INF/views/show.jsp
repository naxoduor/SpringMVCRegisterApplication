<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:include page="../fragments/header.jsp" />
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
    
        <body>
        <div class="container">
        <c:if test="${not empty msg}">
            <div class="alert alert-${css} alert-ddismissable" role="alert">
                <button type="button" class="close" data-dismiss="alert"
                        aria-label="close">
                    <span aria-hidden="true">x</span>
                </button>
                <strong>${msg}</strong>
                
            </div>
        </c:if>
        
        <h1>User Detail</h1>
        <br />
        <div class="row">
        <label class="col-sm-2">ID</label>
        <div class="col-sm-10">${user.id}</div>
        </div>
        
        <div class="row">
            <label class="col-sm-2">Name</label>
            <div class="col-sm-10">${user.name}</div>
        </div>
        
        <div class="row">
            <label class="col-sm-2">Email</label>
            <div class="col-sm-10">${user.email}</div>
        </div>
        
        <div class="row">
            <label class="col-sm-2">Address</label>
            <div class="col-sm-10">${user.address}</div>
        </div>
        
        <div class="row">
            <label class="col-sm-2">Newsletter</label>
            <div class="col-sm-10">${user.newsletter}</div>
        </div>
        
        <div class="row">
            <label class="col-sm-2">Web Frameworks</label>
            <div class="col-sm-10">${user.framework}</div>
        </div>
        
        <div class="row">
            <label class="col-sm-2">Sex</label>
            <div class="col-sm-10">${user.sex}</div>
        </div>
        
        <div class="row">
            <label class="col-sm-2">Number</label>
            <div class="col-sm-10">${user.number}</div>
        </div>
        
        <div class="row">
            <label class="col-sm-2">Country</label>
            <div class="col-sm-10">${user.country}</div>
        </div>
        
        <div class="row">
            <label class="col-sm-2">Skill</label>
            <div class="col-sm-10">${user.skill}</div>
        </div>
        
        </div>
            <jsp:include page="../fragments/footer.jsp" />
           
        </body>
            
</html>