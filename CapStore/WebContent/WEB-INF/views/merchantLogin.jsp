<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="login.css">
<meta charset="ISO-8859-1">
<title>CapStore- Merchant Login</title>
</head>
<body>
<form action="https://www.amazon.in" modelAttribute="login" method="post">
<div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>Cap<span>Store</span></div>
		</div>
		<br>
		<div class="signin">
				<input type="text" placeholder=" Merchant Email Id" name="user"><br>
				<input type="password" placeholder="password" name="password"><br>
				<input type="button" value="Sign In"><br>
				
				<a href="http://www.google.com"><input type="button" value="Sign Up"></a> 
		</div>
		</form>
</body>
</html>