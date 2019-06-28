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
			<h1>Sign in to SMS</h1>
		</div>
		<div id="bs-login">
		<form method="post" action="">
			<div class="auth-form-body mt-3">
				<div class="login_field">Username or email address</div>
		
			</div>
		<p class="ex1">Username or email address</p>
		<br>
			<p><input type="text" name="userId"></p>
		<br>
			<p><input type="password" name="passWord"></p>
		<br>
			<input type="submit" name="login" value="登录" formaction="login.do">&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="register" formaction="userAdd.do" value="注册">
			<input type="submit" name="productList" formaction="productList.do" value="产品列表">
		</form>
		</div>
	</div>
</body>
</html>