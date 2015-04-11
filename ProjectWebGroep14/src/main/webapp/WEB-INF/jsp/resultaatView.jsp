<%-- 
    Document   : resultaatView
    Created on : Apr 11, 2015, 6:37:19 PM
    Author     : Jeroen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Resultaten van ${resultaat.voornaam} ${resultaat.familienaam}</h2>
        <h5>Min</h5>
        ${resultaat.min.behaald} / ${resultaat.min.totaal}
        <h5>Max</h5>
        ${resultaat.max.behaald} / ${resultaat.max.totaal}
        <h5>Gemiddelde</h5>
        <fmt:formatNumber value="${resultaat.gemiddelde}" type="number" maxFractionDigits="2"/> / 10

        <h5>Alle Toetsen</h5>
        <c:forEach items="${resultaat.toetsen}" var="toets">
            <span> ${toets.behaald} / ${toets.totaal}</span>
            <br>
            <br>
        </c:forEach>
    </body>
</html>
