<%-- 
    Document   : leerlingOverview
    Created on : Apr 11, 2015, 6:05:05 PM
    Author     : Jeroen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Leerlingen Lijst van klas ${klasNaam}</h2>
        <ul>
            <c:forEach items="${leerlingen}" var="leerling">
                <li>
                    <a href="
                        <c:url value="resultaat.htm">
                            <c:param name="leerlingId" value="${leerling.id}"/>
                        </c:url>">
                        ${leerling.voornaam} ${leerling.familienaam}
                    </a>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
