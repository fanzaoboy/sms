<%@page import="com.sms.beans.*,java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/global.css" type="text/css" />
<title>homePage</title>
</head>
<body>
<a href="logout.do">[注销]</a>
<% 
List<BrandInfo> brandLists = (List) session.getAttribute("brandList");
%>
<table border=1>
<tr>
	<td>品牌编码</td>
	<td>编码简写</td>
	<td>一级品牌</td>
	<td>二级品牌</td>
	<td>产品类型</td>
	<td>所属业务</td>
</tr>
<%
for(int i=0; i< brandLists.size();i++){
%>
<tr>
	<td class="one"><%= brandLists.get(i).getBrandId() %></td>
	<td class="two"><%= brandLists.get(i).getSimpleBrandId() %></td>
	<td><%= brandLists.get(i).getFirBrandName() %></td>
	<td><%= brandLists.get(i).getSecBrandName() %></td>
	<td><%= brandLists.get(i).getBrandTypeId() %></td>
	<td><%= brandLists.get(i).getBrandDeptId() %></td>
</tr>
<%
}
%>
</table>
</body>
</html>