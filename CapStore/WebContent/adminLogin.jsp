<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- <link rel="stylesheet" type="text/css" href="login.css"> -->
<style type="text/css">
@import url(https://fonts.googleapis.com/css?family=Exo:100,200,400);

@import
	url(https://fonts.googleapis.com/css?family=Source+Sans+Pro:700,400,300)
	;

body {
	margin: 0;
	padding: 0;
	background: #fff;
	color: #fff;
	font-family: Arial;
	font-size: 12px;
}

.body {
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
	/* background-clip: url("https://cdn.dribbble.com/users/1000879/screenshots/3273639/store.gif") */
	background-image: url(https://images6.alphacoders.com/330/330183.jpg);
	background-size: cover;
	-webkit-filter: blur(2px);
	z-index: 0;
}

.grad {
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, rgba(0, 0
		, 0, 0)), color-stop(100%, rgba(0, 0, 0, 0.65)));
	/* Chrome,Safari4+ */
	z-index: 1;
	opacity: 0.7;
}

.header {
	position: absolute;
	top: calc(20% - 35px);
	left: calc(60% - 275px);
	z-index: 2;
}

.header div {
	float: left;
	color: rgba(255, 255, 255, 0.8);
	font-family: 'Exo', sans-serif;
	font-size: 80px;
	font-weight: 500;
}

.header div span {
	color: rgba(0, 220, 250, 0.6);
	font-weight: 500;
}

.signin {
	position: absolute;
	top: calc(50% - 75px);
	left: calc(50% - 110px);
	height: 150px;
	width: 350px;
	padding: 10px;
	z-index: 2;
}

.signin input[type=text] {
	width: 250px;
	height: 30px;
	background: transparent;
	border: 1px solid rgba(255, 255, 255, 0.6);
	border-radius: 2px;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
}

.signin label {
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
}

.signin label span {
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	color: lightblue;
	padding: 4px;
}

.signin input[type=password] {
	width: 250px;
	height: 30px;
	background: transparent;
	border: 1px solid rgba(255, 255, 255, 0.6);
	border-radius: 2px;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
	margin-top: 10px;
}

.signin input[type=button] {
	width: 260px;
	height: 35px;
	background: #fff;
	border: 1px solid #fff;
	cursor: pointer;
	border-radius: 2px;
	color: #a18d6c;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 6px;
	margin-top: 10px;
}

.signin input[type=submit] {
	width: 260px;
	height: 35px;
	background: #fff;
	border: 1px solid #fff;
	cursor: pointer;
	border-radius: 2px;
	color: #a18d6c;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 6px;
	margin-top: 10px;
}

.signin input[type=button]:hover {
	opacity: 0.8;
}

.signin input[type=button]:active {
	opacity: 0.6;
}

.signin input[type=text]:focus {
	outline: none;
	border: 1px solid rgba(255, 255, 255, 0.9);
}

.signin input[type=password]:focus {
	outline: none;
	border: 1px solid rgba(255, 255, 255, 0.9);
}

.signin input[type=button]:focus {
	outline: none;
}

::-webkit-input-placeholder {
	color: rgba(255, 255, 255, 0.6);
}

::-moz-input-placeholder {
	color: rgba(255, 255, 255, 0.6);
}

.usertype {
	position: absolute;
	top: calc(30% - 75px);
	left: calc(85% - 50px);
	height: 150px;
	width: 350px;
	padding: 10px;
	z-index: 2;
}

.usertype input[type=button] {
	width: 100px;
	height: 35px;
	background: rgba(0, 220, 250, 0.2);
	border: 1px solid #e6e6e6;
	cursor: pointer;
	border-radius: 2px;
	color: #e6e6e6;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 6px;
	margin-top: 10px;
}

.usertype input[type=button]:hover {
	opacity: 0.8;
}

.usertype input[type=button]:active {
	opacity: 0.6;
}

.usertype input[type=button]:focus {
	outline: none;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="https://www.flipkart.com" modelAttribute="login"
		method="post">
		<div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>
				Cap<span>Store</span>
			</div>
		</div>
		<br>
		<div class="signin">
			<input type="text" placeholder="Admin Email Id" name="user"><br>
			<input type="password" placeholder="password" name="password"><br>
			<input type="submit" value="Sign In"><br> <a
				href="http://www.google.com"><input type="button"
				value="Sign Up"></a>
		</div>
	</form>
</body>
</html>