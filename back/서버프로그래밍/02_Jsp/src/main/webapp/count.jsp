<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2025-05-29
  Time: 오후 3:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  // application
  // 서버 내부에서 공유되는 객체
  Integer count = (Integer) application.getAttribute("count");

  if(count == null){
    count = 1;
  } else count++;

  // 방문자수 저장
  application.setAttribute("count",count); // 값을 저장

%>
<p>현재까지 방문자수 : <%= count%></p>
</body>
</html>
