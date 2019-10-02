<%@page import="java.io.OutputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page import ="com.OnlineBookStoreTO.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>


<table border=1 align=center style="font-size:26px;background-color:Lightblue;color:red;">

<br>



	
		<tr>
		<td style="padding-left: 20px;padding-right: 10px;">ID</td>
		<td style='padding-right:30px;padding-left:30px;'>
		${USERDETAILS.id}
		</td>
		<tr>
		<td style="padding-left: 20px;padding-right: 10px;">NAME</td>
		<td style='padding-right:30px;padding-left:30px;'>
		${USERDETAILS.uname}
		</td>	
		<tr>
		<td style="padding-left: 20px;padding-right: 10px;">EMAIL</td>
		<td style='padding-right:30px;padding-left:30px;'>
		${USERDETAILS.email}
		</td>
		<tr>
		<td style="padding-left: 20px;padding-right: 10px;">PHONE</td>
		<td style='padding-right:30px;padding-left:30px;'>
		${USERDETAILS.phone}
		</td>
</table>

</body>
</html>