<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.sql.*,Util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Connection con = null;
PreparedStatement pst = null;


%>

<%

String id = request.getParameter("id");

con = JdbcUtil.getMysql();
String query = "delete from user_books where id = ?";
pst = con.prepareStatement(query);
pst.setString(1, id);
pst.executeUpdate();

response.sendRedirect("book_cart.jsp");

%>
</body>
</html>