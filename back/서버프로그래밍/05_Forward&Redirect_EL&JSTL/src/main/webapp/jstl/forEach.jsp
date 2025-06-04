<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
❗ 반복문
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="name" items="${memberList}">
    <li>${name}</li>
</c:forEach>
</body>
</html>
