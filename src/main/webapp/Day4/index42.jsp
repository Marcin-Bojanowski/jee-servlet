<%--
  Created by IntelliJ IDEA.
  User: bojan
  Date: 2020-05-30
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Index42</title>
</head>
<body>

<c:forEach begin="${param.start}" end="${param.end}" step="${param.step}" var="number">
    ${number}
</c:forEach>
</body>
</html>
