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
		<form method="post" action="">
		<p class="ex1">Username or email address</p>
		<label for="login_field">Username or email address</label>
		<input type="text" name="userId" id="login_field">
			<p><input type="text" name="userId"></p>
			<p><input type="password" name="passWord"></p>
			<input type="submit" name="login" value="登录" formaction="login.do">&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="register" formaction="userAdd.do" value="zhuce">
		</form>
		</div>
	</div>
</body>
</html>