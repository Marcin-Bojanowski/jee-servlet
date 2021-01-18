<%--
  Created by IntelliJ IDEA.
  User: bojan
  Date: 2020-05-30
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Index41</title>
</head>
<body>

<c:if test="${not empty param.author}">
    <p>Wybrany autor  <c:out value="${param.author}" default="default" escapeXml="false"></c:out></p>

</c:if>
</body>
</html>
