<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Lightblue" style="font-size: 22px;color:red;">
<%@ include file="/WEB-INF/pages/header.html"%>
<%@ include file="/WEB-INF/pages/menu.html"%>

<img src="images/vicky.jpg" height="100px" width="80px"><br>
<% 
	response.setContentType("text/html");
	String user = (String)session.getAttribute("USERNAME");
	String pass = (String)session.getAttribute("PASSWORD");
	
	out.println("Username  :  " +user+"<br>");
	out.println("Password  :  " +pass);
%>
<%@ include file="/WEB-INF/pages/footer.html"%>
</body>
</html>