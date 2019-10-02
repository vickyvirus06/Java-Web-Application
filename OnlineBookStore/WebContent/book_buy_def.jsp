<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,com.OnlineBookStoreTO.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Shop</title>
</head>
<body style="background-color: Lightblue;">
<%@ include file="/WEB-INF/pages/header.html" %>

<%@ include file="/WEB-INF/pages/menu.html" %>
<jsp:include page="/WEB-INF/book_buy.jsp"></jsp:include>

<%@ include file="/WEB-INF/pages/footer.html"%>
</body>
</html>