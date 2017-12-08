<%-- 
    Document   : error
    Created on : Nov 17, 2017, 7:29:21 AM
    Author     : maradona
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../fragments/header.jsp" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Error Page</h1>
            <p>${exception.message}</p>
            Exception: ${exception.message}.
            <!--<c:forEach items="${exception.stackTrace}" var="stackTrace">
                ${stackTrace}
                </c:forEach>
            -->
        </div>
            <jsp:include page="../fragments/footer.jsp" />
    </body>
</html>
