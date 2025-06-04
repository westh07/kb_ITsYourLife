<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2025-06-04
  Time: 오후 3:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
EL
- JSP 에서 자바 코드를 직접 작성하지 않고도 속성을 출력할 수 있게 해주는 표현식 문법

EL이 검색하는 순서
- page -> request -> session -> application
(작 -> 큰 단위)
--%>
<%
    // page
    pageContext.setAttribute("username","페이지");
%>
<p>안녕하세요, ${username} 님!</p> <%-- request에 저장 --%>
</body>
</html>
