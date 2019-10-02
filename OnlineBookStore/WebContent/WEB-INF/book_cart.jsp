 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Cart</title>
</head>
<body bgcolor="Lightyellow">
<table border=1 align=center style="font-size:26px;background-color:Lightblue;color:red;">
<tr style="background-color:blue;color:yellow;"><td>ID</td><td>NAME</td><td>AMOUNT<td>DISCOUNT</td><td>TOTAL PAY</td><td>REMOVE</td></tr>
<br>


<c:forEach items="${BOOKCART}" var = "book">
	<form action='remove_process'>
		<tr>

		<td style='padding-right:30px;padding-left:30px;'>
		${book.id}
		</td>
		<td style='padding-right:30px;padding-left:30px;'>
		${book.name}
		</td>
		<td style='padding-right:30px;padding-left:30px;'>
		${book.amount}
		
		</td>
		
		
		<td style='padding-right:30px;padding-left:30px;'>
		${book.discount} %
		</td>
		<td style='padding-right:30px;padding-left:30px;'>
		${book.total_pay}
		</td>
		<td>
		<input type='hidden' name='id' value="${book.id}">
		<input type='hidden' name='name' value="${book.name}">
		
		<input style='color:blue;padding-left:40px;padding-right:40px;' type='submit' value = 'Remove'>
		</td>
		</tr>
		</td>
		</form>	
	
</c:forEach>
</table>
<table border = "1" style="font-size:26px;background-color:blue;color:yellow;">
<tr ><td style="padding-left:20px;padding-right:20px;">Amount</td><td style="background-color:Lightblue;color:red;padding-left:20px;padding-right:20px;">${TOTALAMOUNT}</td></tr>
</table>

<form action="checkout_process" ><input style="font-size:26px;color:blue;background-color:yellow;" type="submit" value="Checkout"></form>

</body>
</html>