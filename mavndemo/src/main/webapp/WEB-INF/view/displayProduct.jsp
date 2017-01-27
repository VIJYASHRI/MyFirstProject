<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Name of the Product: ${productObj.productName}<br>
Manufacturer: ${productObj.manufacturer }<br>
Price: ${productObj.price }<br>
Quantity: ${productObj.quantity }<br>
TotalPrice: ${productObj.price * productObj.quantity }<br>

<a href="http://localhost:8080/mavndemo/">Home Page</a>
</body>
</html>