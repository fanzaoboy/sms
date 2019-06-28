<%@page import="com.sms.beans.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>homePage</title>
</head>
<body>
<% 
UserInfo user = (UserInfo) session.getAttribute("user");
%>
你好，<%= user.getUserName() %>
<a href="logout.do">[注销]</a>
<a href="productList.do">[产品列表]</a>
</body>
</html>