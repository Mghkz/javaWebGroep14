<%-- 
    Document   : overviewView
    Created on : Apr 7, 2015, 5:15:51 PM
    Author     : Jeroen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Klassen Lijst</h2>
        <ul>
            <c:forEach items="${klassen}" var="klas">
                <li>
                    <a href="
                       <c:url value="leerling.htm">
                           <c:param name="klasNaam" value="${klas}"/>
                       </c:url>">
                        ${klas}
                    </a>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
