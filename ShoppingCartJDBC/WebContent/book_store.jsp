<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, Util.*, java.sql.*,com.Bean.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Lightyellow">
	
	<%@ include file="/WEB-INF/pages/header.html"%>
	<%@ include file="/WEB-INF/pages/menu.html"%>
	<br>
	<form action="book_process.jsp">
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
	<%@ include file="/WEB-INF/pages/footer.html"%>
	
</body>
</html>