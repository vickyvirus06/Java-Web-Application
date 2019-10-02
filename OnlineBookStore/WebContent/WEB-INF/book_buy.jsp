<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Shop</title>
</head>
<body>
<table border=1 align=center style="font-size:26px;background-color:Lightblue;color:red;">
<tr style="background-color:blue;color:yellow;"><td>NAME</td><td>AMOUNT</td><td>BUY</td></tr>

<c:forEach items="${BOOKS}" var="books">
<form action='book_add'>
	<tr>
	<td style="padding-right:30px;padding-left:30px">
	${books.name}
	</td>
	<td style="padding-right:30px;padding-left:30px">
	${books.amount}
	</td>
	<td>
	<input type='hidden' name='name' value="${books.name}">
	<input type='hidden' name='amount' value="${books.amount}">
	<input style="color:blue;padding-left:40px;padding-right:40px" type='submit' value = 'Buy'>
	</td>
	</tr>
	</td>
	</form>			

</c:forEach>
</table>
</body>
</html>