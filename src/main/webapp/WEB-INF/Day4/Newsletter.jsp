<%--
  Created by IntelliJ IDEA.
  User: bojan
  Date: 2020-05-31
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Newsletter</title>
</head>
<body>
<form action="/newsletter" method="POST">
<p>
    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque iaculis tincidunt venenatis. Phasellus condimentum neque id velit tincidunt molestie. Proin orci est, rhoncus at lectus id, pellentesque rhoncus magna. Donec feugiat tincidunt diam non sagittis. Duis viverra arcu et ligula malesuada, ac mattis leo laoreet. Ut varius malesuada ipsum, a tincidunt arcu feugiat in. Aenean hendrerit mauris imperdiet, elementum ipsum in, pharetra justo. Aenean vitae efficitur lectus, eget suscipit erat. Suspendisse ornare mauris sed velit eleifend, in iaculis turpis lobortis. Donec feugiat metus dictum gravida pretium. Integer eget mi risus.</p>
Email:<br>
<input type="text" name="email"><br>
Imię i nazwisko:<br>
<input type="text" name="name"><br>
<input type="submit" name="Wyślij"><br>
</form>
</body>
</html>
