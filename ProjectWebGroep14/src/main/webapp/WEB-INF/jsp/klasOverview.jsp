<%-- 
    Document   : overviewView
    Created on : Apr 7, 2015, 5:15:51 PM
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
        <h2>Klassen Lijst</h2>
        <c:forEach items="${klassen}" var="klasVar">
            <div>
                <a href="
                   <c:url value="leerling.htm">
                       <c:param name="klasNaam" value="${klasVar.naam}"/>
                   </c:url>">
                    ${klasVar.naam}
                </a>
                <br>
                <p>
                <h4>Gemiddelde per toets</h4>
                Not Implemented yet
                <h4>Gemiddelde Alle toetsen</h4>
                <fmt:formatNumber value="${klasVar.gemiddeldeAlleToetsen}"type="percent" maxFractionDigits="2"/>
                <h4>Maximale Score</h4>
                ${klasVar.max.voornaam} ${klasVar.max.familienaam}:
                ${klasVar.max.max.behaald}/${klasVar.max.max.totaal}
                <h4>Minimale Score</h4>
                ${klasVar.min.voornaam} ${klasVar.min.familienaam}:
                ${klasVar.min.min.behaald}/${klasVar.min.min.totaal}
            </p>
        </div>
    </c:forEach>
    </body>
</html>
