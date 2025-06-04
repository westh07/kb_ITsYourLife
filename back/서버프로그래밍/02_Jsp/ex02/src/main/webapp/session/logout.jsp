<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2025-05-29
  Time: 오후 3:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  // 세션 무효화
  session.invalidate();

  // 로그인 폼으로 이동
  response.sendRedirect("LoginForm.html");

%>
