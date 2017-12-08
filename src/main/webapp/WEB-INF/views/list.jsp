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
                <div class="alert alert-${css} alert-dismissable" role="alert">
                    <button type="button" class="close" data-dismiss="alert"
                            arie-label="Close">
                        <span arfa-hidden="true">x</span>
                    </button>
                    <strong>${msg}</strong>
                </div>
            </c:if>
            
            <h1>All Users</h1>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>#ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>framework</th>
                        <th>Action</th>
                    </tr>
                </thead>
                
                <c:forEach var="user" items="${users}">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.name}</td>
                        <td>${user.email}</td>
                        <td>
                            <c:forEach var="framework" items="${user.framework}" 
                                       varStatus="loop">
                                ${framework}
                                <c:if test="${not loop.last}">,</c:if>
                            </c:forEach>
                        </td>
                        
                        <td>
                            <spring:url value="/users/${user.id}" var="userUrl" />
                            <spring:url value="/users/${user.id}/delete" var="deleteUrl" />
                            <spring:url value="/users/${user.id}/update" var="updateUrl" />
                            
                            <button class="btn btn-info" onclick="location.href='${userUrl}'">Query</button>
                            <button class="btn btn-primary" onclick="location.href='${updateUrl}'" value="submit">Update</button>
                            <button class="btn btn-danger" onclick="this.disabled=true;post('${deleteUrl}')">Delete</button>
                        </td>
                    </tr>
                </c:forEach>
                
            </table>
        </div>
        <jsp:include page="../fragments/footer.jsp" />
        
    </body>
</html>