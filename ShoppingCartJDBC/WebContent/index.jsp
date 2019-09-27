<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body , html
{
	height: 100%;
}
body {

	background-image: url("images/books5.jpg");
	background-repeat: no-repeat;
	background-position: center;
	background-size: 1380px 768px;
	height: 100%;

}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Lightyellow" align="center" style="color:white;" >
<h1 style="background-color:blue;color:white;font-size:50px;size:200px;">Vicky Book Centre</h1>
	<form action="verify.jsp" >
		<table align="center" border="1" style="font-size:30px;" >
			<tr >
				<td style="background-color:blue;">Username</td>
				<td><input type="text" name ="username">
			</tr>
			<tr>
				<td style="background-color:blue;">Password</td>
				<td><input style="" type="password" name ="password" >
			</tr>
			<tr>
				
				<td colspan="2"><input style="font-size:25px;" type="submit" value="login">
			</tr>
		</table>
	</form>
	<br>
	<h3 style="background-color:blue;color:white;font-size:30px;display: inline">All Rights Reserved @ Vicky Poojari</h3>
	<h2 style="color:red">${LOGINMESSAGE}</h2>
	<h2 style="color:red">${LOGOUTMESSAGE}</h2>
</body>
</html>