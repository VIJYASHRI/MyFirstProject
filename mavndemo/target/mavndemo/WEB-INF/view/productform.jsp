<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ tablib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>productform</title>
</head>
<body>
<form:form action="procesProductData" commandName="product">
	<table>
		<tr><td>PRODUCT NAME</td></tr>
			<td><tr><form:input type="text" path="productName"/></td></tr>
			<tr><td>PRODUCT PRICE</td></tr>
			<tr><td><form:input type="text" path="price"/></td></tr>
			<tr><td>MANUFACTURER</td></tr>
			<tr><td><form:input type="text" path="manufacturer"/></td></tr>
			<tr><td>QUANTITY</td></tr>
			<tr><td><form:input type="text" path="quantity"/></td></tr>
				<tr><td>
				<input type="submit" value="Add Product"/>
				</td></tr>
	</table></form:form>
</body>
</html>