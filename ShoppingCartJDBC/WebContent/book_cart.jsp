 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,java.sql.*,Util.*,com.Bean.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Lightyellow">
<%@ include file="/WEB-INF/pages/header.html" %>

<%@ include file="/WEB-INF/pages/menu.html" %>
<table border=1 align=center style="font-size:26px;background-color:Lightblue;color:red;">
<tr style="background-color:blue;color:yellow;"><td>ID</td><td>NAME</td><td>AMOUNT<td>DISCOUNT</td><td>TOTAL PAY</td><td>REMOVE</td></tr>
<br>
<%!
Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;

%>

<%
int amount=0;
int discount = 30;
int total_pay = 0;
	con = JdbcUtil.getMysql();
	String query = "Select * from user_books";
	pst = con.prepareStatement(query);
	rs = pst.executeQuery();
	while(rs.next())
	{
		out.println("<form action='remove_process.jsp'>");
		out.println("<tr>");

		out.println("<td style='padding-right:30px;padding-left:30px;'>");
		out.println(rs.getString(1));
		out.println("</td>");
		out.println("<td style='padding-right:30px;padding-left:30px;'>");
		out.println(rs.getString(2));
		out.println("</td>");
		out.println("<td style='padding-right:30px;padding-left:30px;'>");
		out.println(rs.getString(3));
		
		out.println("</td>");
		
		
		out.println("<td style='padding-right:30px;padding-left:30px;'>");
		out.println(rs.getString(4)+"%");
		out.println("</td>");
		out.println("<td style='padding-right:30px;padding-left:30px;'>");
		out.println(rs.getString(5));
		out.println("</td>");
		amount = Integer.parseInt(rs.getString(5))+amount;
		out.println("<td>");
		out.print("<input type='hidden' name='id' value='"+rs.getString(1)+"'>");
		
		out.println("<input style='color:blue;padding-left:40px;padding-right:40px;' type='submit' value = 'Remove'");
		out.println("</td>");
		out.println("</tr>");
		out.println("</td>");
		out.println("</form>");	
	}
	
	session.setAttribute("AMOUNT", amount);
%>

</table>
<table border = "1" style="font-size:26px;background-color:blue;color:yellow;">
<tr ><td style="padding-left:20px;padding-right:20px;">Amount</td><td style="background-color:Lightblue;color:red;padding-left:20px;padding-right:20px;"><%=amount %></td></tr>
</table>

<form action="checkout.jsp" ><input style="font-size:26px;color:blue;background-color:yellow;" type="submit" value="Checkout"></form>
<%@ include file="/WEB-INF/pages/footer.html" %>
</body>
</html>