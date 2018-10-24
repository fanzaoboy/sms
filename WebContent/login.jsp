<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>烦躁boy的vblog</title>
	<meta http-equiv="Content-Type" content="text/html">
	<link rel="stylesheet" href="css/globalstyle.css" type="text/css" />
</head>
<body>
	<div id="bs-body">
		<div class="icon">
			<img src="photo/web_icon.png" height="65px" width="65px">
		</div>
		<div class="auth-form-header">
			<h1>Sign in to SMS</h1>
		</div>
		<div id="bs-login">
		<form method="post" action="login.do">
			<p>用户名：<input type="text" name="userId"></p>
			<p>密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="passWord"></p>
			<input type="submit" name="login" value="登录">&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" name="register" action="userAdd.do" value="注册">
		</form>
		</div>
	</div>
</body>
</html>