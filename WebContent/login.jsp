<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>烦躁boy的vblog</title>
	<meta http-equiv="Content-Type" content="text/html">
	<link rel="stylesheet" type="text/css" href="http://localhost:8080/StuManaSystem/css/globalstyle.css">
	<style type="text/css">
	#bs-body{width:100%;height:100%;}
	</style>
</head>
<body>
	<div id="bs-body">
	<img src="photo/sea.jpg">
		<h1>欢迎登陆学生管理系统</h1>
		<form method="post" action="login.do">
			<p>用户名：<input type="text" name="username"></p>
			<p>密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"></p>
			<input type="submit" name="login" value="登录">
		</form>
	</div>
</body>
</html>