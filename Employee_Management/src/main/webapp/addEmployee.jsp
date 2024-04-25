<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="save" modelAttribute="employee">
	<form:label path="name">NAME:</form:label>&nbsp;&nbsp;&nbsp;&nbsp;
	<form:input path="name"/>
	<br><br>
	<form:label path="designation">DESIGNATION:</form:label>
	<form:input path="designation"/>
	<br><br>
	<form:label path="phone">PHONE NUMBER:</form:label>
	<form:input path="phone"/>
	<br><br>
	<input type="submit" value ="save">
	
</form:form>

</body>
</html>