<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Checkout</title>
</head>
<body>
<body  style="background-color: Lightblue;font-size: 22px;color:red;">
<%@ include file="/WEB-INF/pages/header.html"%>
<%@ include file="/WEB-INF/pages/menu.html"%>
<jsp:include page="/WEB-INF/checkout.jsp"></jsp:include>

<%@ include file="/WEB-INF/pages/footer.html"%>
</body>
</html>