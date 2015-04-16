<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
    <head>
        <title>Login Page</title>
    </head>
    <body>
        <div id="login-box">

            <c:url value="/login" var="loginUrl"/>
            <form action="${loginUrl}" method="post">       
                <c:if test="${param.error != null}">        
                    <p>
                        ${error}
                    </p>
                </c:if>
                <c:if test="${param.logout != null}">       
                    <p>
                        ${msg}
                    </p>
                </c:if>
                <p>
                    <label for="username">Gebruikersnaam</label>
                    <input type="text" id="username" name="username"/>	
                </p>
                <p>
                    <label for="password">Paswoord</label>
                    <input type="password" id="password" name="password"/>
                </p>
                <input type="hidden"                        
                       name="${_csrf.parameterName}"
                       value="${_csrf.token}"/>
                <button type="submit" class="btn">Log in</button>
            </form>
        </div>

    </body>
</html>