<%--
  Created by IntelliJ IDEA.
  User: bojan
  Date: 2020-05-31
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Servlet 311</title>
</head>
<body>
<form action="/servlet312" method="POST">
    ${lang}
    <select name="language">

        <option value="">Select...</option>
        </br>
        <option value="en">English</option>
        </br>
        <option value="pl">Polish</option>
        </br>
        <option value="de">Deutsch</option>
        </br>
        <option value="es">Spanish</option>
        </br>
        <option value="fr">French</option>
        </br>
        <input type="submit"></br>
    </select>
</form>
</body>
</html>
