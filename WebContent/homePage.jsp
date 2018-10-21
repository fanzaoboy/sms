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
<div ></div>
<img src="photo/web_icon.png">
<% 
UserInfo user = (UserInfo) session.getAttribute("user");
%>
你好，<%= user.getUserName() %>
<img src="photo/sea.jpg">

</body>
</html>