<%@page import="com.sms.*" %>
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

<table border=1>
<tr>
	<td>品牌编码</td>
	<td>编码简写</td>
	<td>一级品牌</td>
	<td>二级品牌</td>
	<td>产品类型</td>
	<td>所属业务</td>
</tr>
<%=request.getSession.getAttribute("brandList");%> 
<%=	
	for(brandList : brand) {
%>
<tr>
	<td><%=brand.getBrandId() %></td>
	<td><%=brand.getBrandId() %></td>
	<td><%=brand.getBrandId() %></td>
	<td><%=brand.getBrandId() %></td>
	<td><%=brand.getBrandId() %></td>
	<td><%=brand.getBrandId() %></td>
</tr>

<%
}
%>
</table>
</body>
</html>