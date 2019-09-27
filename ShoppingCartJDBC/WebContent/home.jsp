<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import= "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Lightyellow" style="color:red;font-size:42px;">
<%@ include file="/WEB-INF/pages/header.html" %>

<%@ include file="/WEB-INF/pages/menu.html" %>

<img  src="images/offer.jpg" width="100%" height="450px">
<%
	out.println("<br>"); 
	String user = (String)session.getAttribute("USERNAME");

	out.println("Welcome " + user);
%>
<%@ include file="/WEB-INF/pages/footer.html" %>
</body>
</html>