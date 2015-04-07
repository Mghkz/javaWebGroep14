<%-- 
    Document   : logInForm
    Created on : Apr 7, 2015, 12:22:45 PM
    Author     : Jeroen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form method="POST" action="logIn.htm" modelAttribute="user">
            <p> <label>Username:</label>
                <form:input path="username"/>&nbsp;
                <form:errors path="username" cssClass="error"/>
            </p>
            <p> <label>Password:</label>
                <form:input path="password"/>&nbsp;
                <form:errors path="password" cssClass="error"/>
            </p>
            <input type="submit" value="OK">
        </form:form>
    </body>
</html>
