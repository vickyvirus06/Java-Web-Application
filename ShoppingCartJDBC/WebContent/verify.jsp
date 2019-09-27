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
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	Connection con = JdbcUtil.getMysql();
	PreparedStatement pst = con.prepareStatement("Select * from login where username = ? and password = ?");
	pst.setString(1, username);
	pst.setString(2, password);
	ResultSet rs = pst.executeQuery();
	while(rs.next())
	{
		session.setAttribute("USERNAME", username);
		session.setAttribute("PASSWORD", password);	
		%><jsp:forward page="home.jsp"></jsp:forward> %>
		<%
	}
	
	request.setAttribute("LOGINMESSAGE", "Invalid Username Or Password");
	request.getRequestDispatcher("index.jsp").forward(request, response);
	
%>
</body>
</html>