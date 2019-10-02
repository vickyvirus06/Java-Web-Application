<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.OnlineBookStore.Util.*, java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Shop</title>
</head>
<body bgcolor="Lightyellow">
	
	
	<br>
	<form action="book_buy_process">
		<table align="center">
			<tr>
				<td><select style="font-size: 28px;" name="programming">
						<option value="java">JAVA</option>
						<option value="html">HTML</option>
						<option value="sql">SQL</option>
				</select></td>
			</tr>

		</table>

		<input style="font-size: 22px; background-color: green;" type="submit"
			value="submit">
	</form>
	
	
</body>
</html>