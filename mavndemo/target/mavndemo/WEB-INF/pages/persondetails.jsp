<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ tablib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="addPerson" commandName="person">
	Name:<input type="text" name="name">
	Email:<input type="text" name="email">
	Phone Number:<input type="text" name="phoneNumber">
	<input type="submit" value="Enter Details">
</form:form>
</body>
</html>