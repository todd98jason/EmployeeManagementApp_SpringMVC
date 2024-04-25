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
<form:form action="remove" modelAttribute="employee"><!-- the java object -->

<form:label path="id"> Enter ID: </form:label>
<form:input path="id"/>
<br><br>
<input type="submit" value="REMOVE">
</form:form>

</body>
</html>