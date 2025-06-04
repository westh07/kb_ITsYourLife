<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
JSTL 라이브러리를 사용하기 위한 지시어
- prefix="c" : Core 태그를 사용할 때 접두사로 c:를 쓰겠다.

❗ 조건문
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- else가 없어서 if로만 사용 --%>
<c:if test="${score >= 60}">
    <p>합격입니다!</p>
</c:if>
<c:if test="${score < 60}">
    <p>불합격입니다</p>
</c:if>
</body>
</html>
