<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>productform</title>
</head>
<body>
<form:form action="procesProductData" commandName="product">
	<table>
			<tr>
				<td>PRODUCT NAME</td>
				<td><form:input type="text" path="productName" /></td>
			</tr>
			<tr>
			<td>PRODUCT PRICE</td>
			<td><form:input type="text" path="price"/></td>
			</tr>
			<tr>
			<td>MANUFACTURER</td>
			<td><form:input type="text" path="manufacturer"/></td>
			</tr>
			<tr><td>QUANTITY</td>
			<td><form:input type="text" path="quantity"/></td>
			</tr>
			
				<tr><td>
				<input type="submit" value="Add Product"/>
				</td></tr>
	</table></form:form>
</body>
</html>