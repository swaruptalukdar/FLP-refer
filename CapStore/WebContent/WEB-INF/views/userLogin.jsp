<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="login.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="userlogin" modelAttribute="login" method="post">
<div class="body"></div>
	<div class="usertype">
		<a href="adminLogin.html">
			<input type="button" value="Admin">
		</a>
		<br>
		<a href="merchantLogin.html">
			<input type="button" value="Merchant">
		</a>
	</div>
	<div class="grad"></div>
	<div class="header">
		<div>
			Cap<span>Store</span>
		</div>
	</div>
	<br>
	<div class="signin">
		<input type="text" placeholder="Email Id" name="email" id="emailID"><br>
		<input type="password" placeholder="Password" name="password" id="pwd"><br><br>
		<label>Forgot Password ? <a href="http://www.google.com"><span >Change</span></a></label>
		<input type="submit" value="Sign In"><br> 
		<a href="https://www.amazon.in"><input type="button" value="Sign Up"></a>
	</div>
	</form>
</body>
</html>