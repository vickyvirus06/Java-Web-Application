<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body style="background-color: Lightblue;">
<%@ include file ="/WEB-INF/pages/header.html"  %>

<%@ include file ="/WEB-INF/pages/menu.html"  %>

<jsp:include page="/WEB-INF/home.jsp"></jsp:include>
<img  src="images/offer.jpg" width="100%" height="450px">

<%@ include file ="/WEB-INF/pages/footer.html"  %>
</body>
</html>