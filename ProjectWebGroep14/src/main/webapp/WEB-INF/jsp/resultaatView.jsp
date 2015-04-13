<%-- 
    Document   : resultaatView
    Created on : Apr 11, 2015, 6:37:19 PM
    Author     : Jeroen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Resultaten van ${leerling.voornaam} ${leerling.familienaam}</h2>
        <h3>Min</h3>
        ${leerling.min.naam}:<br>
        ${leerling.min.behaald} / ${leerling.min.totaal}
        <h3>Max</h3>
        ${leerling.max.naam}:<br>
        ${leerling.max.behaald} / ${leerling.max.totaal}
        <h3>Gemiddelde</h3>
        <fmt:formatNumber value="${leerling.gemiddelde}" type="number" maxFractionDigits="2"/> / 10

        <h3>Alle Toetsen</h3>
        <c:forEach items="${leerling.toetsen}" var="toets">
            <h4>${toets.naam}</h4>
            <span> ${toets.behaald} / ${toets.totaal}</span><br>
        </c:forEach>
    </body>
</html>
