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

<form:form action="view" modelAttribute="employee">

<form:label path="id"> Enter ID: </form:label>
<form:input path="id"/>
<input type="submit" value="search">
</form:form>

</body>
</html>
