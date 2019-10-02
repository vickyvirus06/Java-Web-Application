<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="/WEB-INF/MyTag.tld" %>
<!DOCTYPE html>
<html>
<head>
<style>
body , html
{
	height: 100%;
}
body {

	background-image: url("http://localhost:8866/OnlineBookStore/images/books.jpg");
	background-repeat: no-repeat;
	background-position: center;
	background-size: 1380px 768px;
	height: 100%;

}
</style>


<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="Lightyellow" align="center" style="color:white;" >
<h1 style="background-color:blue;color:white;font-size:50px;size:200px;">Vicky Book Centre</h1>
	<form action="login" method="post" >
		<table align="center" border="1" style="font-size:30px;" >
			<tr >
				<td style="background-color:blue;">Username</td>
				<td><input type="text" name ="username">
				<td>
			<font size="4" color="red"><b><c:error property="uname"></c:error></b></font>
			</td>
				
			</tr>
			<tr>
				<td style="background-color:blue;">Password</td>
				<td><input style="" type="password" name ="password" >
				<td>
			<font size="4" color="red"><b><c:error property="pword"></c:error></b></font>
			</td>
			</tr>
			<tr>
				
				<td colspan="2"><input style="font-size:25px;background-color: cyan;color:blue;" type="submit" value="login">
			</tr>
	
			
		</table>
	</form>
	<br>
	<a href="register_user_def.jsp" ><font size="6" >Signup Here</font></a> <br>
	
	<br>
	<h3 style="background-color:blue;color:white;font-size:30px;display: inline">All Rights Reserved @ Vicky Poojari</h3>
	<h2 style="color:red">${LOGINMESSAGE}</h2>
	<h2 style="color:red">${LOGOUTMESSAGE}</h2>
	<br>
</body>
</html>