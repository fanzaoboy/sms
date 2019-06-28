<%@page import="com.sms.beans.*,java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>homePage</title>
</head>
<body>
<!-- 对div设置 align="center" -->

<div align="center">
<% 
UserInfo user = (UserInfo) session.getAttribute("user");
%>
你好，<%= user.getUserName() %>
<a href="logout.do">[注销]</a>
<a href="productList.do">[产品列表]</a>
<table border=1>
<%
List<UserInfo> userList = (List) session.getAttribute("userList");
%>
<tr>
	<td>用户id</td>
	<td>用户姓名</td>
	<td>用户状态</td>
	<td>操作</td>
</tr>
<%
for(int i=0; i< userList.size();i++){
%>
<tr>
	<td><%= userList.get(i).getUserId() %></td>
	<td><%= userList.get(i).getUserName() %></td>
	<td><%= userList.get(i).getStateId() %></td>
	<td> <a>编辑</a> <a>删除</a></td>
</tr>
<%
}
%>
</table>
</div> 
</body>
</html>