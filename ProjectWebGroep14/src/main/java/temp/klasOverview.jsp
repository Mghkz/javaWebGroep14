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
        <c:forEach items="${klassen}" var="klas">
            <div>
                <a href="
                   <c:url value="leerling.htm">
                       <c:param name="klasNaam" value="${klas}"/>
                   </c:url>">
                    ${klas}
                </a>
                <br>
                <p>
                <h4>Gemiddelde per toets</h4>
                Not Implemented yet
                <!--
                <h4>Gemiddelde Alle toetsen</h4>
                <!--<!fmt:formatNumber value="${klas.gemiddeldeAlleToetsen}"type="percentage"/>-->
                <h4>Maximale Score</h4>
                ${klas.max.voornaam} ${klas.max.familienaam}
                ${klas.max.max.behaald} ${klas.max.max.totaal}
                <h4>Minimale Score</h4>
                ${klas.min.voornaam} ${klas.min.familienaam}
                ${klas.min.min.behaald} ${klas.min.min.totaal}
            </p>
        </div>
    </c:forEach>

</body>
</html>
