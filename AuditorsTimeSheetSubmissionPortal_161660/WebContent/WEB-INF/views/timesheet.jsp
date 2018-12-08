<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TimeSheet</title>
</head>
<body>
<h1>BlueBrains Auditing Services Internet Portal- TimeSheet Entry</h1>


<table border="1" align="center">

<c:form action="success" method="post" modelAttribute="add" >

<tr>
<td>Employee Id :</td>
<td> <c:input path="empId" /></td>

</tr>

<tr>
<td>Time Sheet Date :</td>
<td><c:input path="tsDate" value="${date}"/></td>
<%--  <td> ${date}</td> --%>
</tr>

<tr>
<td>First Hour Activity :</td>
<td> 
<c:select path="hour1" items="${data}"></c:select>
</td>
</tr>

<tr>
<td>Second Hour Activity :</td>
<td> 
<c:select path="hour2" items="${data}"></c:select>
</td>
</tr>


<tr>
<td>Third Hour Activity :</td>
<td> 
<c:select path="hour4" items="${data}"></c:select>
</td>
</tr>

<tr>
<td>Four Hour Activity :</td>
<td> 
<c:select path="hour5" items="${data}"></c:select>
</td>
</tr>

<tr>
<td>Five Hour Activity :</td>
<td> 
<c:select path="hour5" items="${data}"></c:select>
</td>
</tr>

<tr>
<td>Six Hour Activity :</td>
<td> 
<c:select path="hour6" items="${data}"></c:select>
</td>
</tr>

<tr>
<td>Seven Hour Activity :</td>
<td> 
<c:select path="hour7" items="${data}"></c:select>
</td>
</tr>

<tr>
<td>Eight Hour Activity :</td>
<td> 
<c:select path="hour8" items="${data}"></c:select>
</td>
</tr>


<tr>
<td></td>
<td>
<input type="submit" value="Save" />
</td>
</tr>

</c:form>


</table>
<a href="home">Home</a>
</body>
</html>