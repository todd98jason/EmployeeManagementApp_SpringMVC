<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="2">

<tr>
<th>Id</th>
<th>Name</th>
<th>Phone Number</th>
</tr>

<tr>
	<td>${employee.getId()}</td>
	<td>${employee.getName()}</td>
	<td>${employee.getPhone()}</td>
</tr>

</table>
<br><br>
<button><a href="Index.jsp">home</a></button>

</body>
</html>