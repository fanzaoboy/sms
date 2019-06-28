<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Sign in to SMS</title>
	<meta http-equiv="Content-Type" content="text/html">
	<link rel="stylesheet" href="css/globalstyle.css" type="text/css" />
	<link rel="icon" href="photo/web_icon.png" type="image/x-icon" />
</head>
<body>
	<div id="bs-body">
		<div class="icon">
			<img src="photo/web_icon.png" height="65px" width="65px">
		</div>
		<div class="auth-form-header">
			<h1>Register</h1>
		</div>
		<div id="bs-login">
		<form method="post" action="">

		<p class="ex1">Username or email address</p>
		<br>
			<p><input type="text" name="userName"></p>
		<br>
			<p><input type="password" name="password"></p>
		<br>
			<input type="submit" name="register" formaction="userAdd.do" value="注册">
		</form>
		</div>
	</div>
</body>
</html>