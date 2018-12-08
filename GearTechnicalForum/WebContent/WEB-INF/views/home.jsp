<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gear Technical Forum</title>
</head>
<body>
    <h1 align="center">Gear Technical Forum</h1>
	<form action="answerthequery" modelAttribute="query" method="GET">
		Query Id :	<input type="text" id="queryId" name="queryId" />
			<input type="submit" value="search"/>
		</form> 
</body>
</html>