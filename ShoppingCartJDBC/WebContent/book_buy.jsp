<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,com.Bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: Lightyellow;">
<%@ include file="/WEB-INF/pages/header.html" %>

<%@ include file="/WEB-INF/pages/menu.html" %>
</br>

<table border=1 align=center style="font-size:26px;background-color:Lightblue;color:red;">
<tr style="background-color:blue;color:yellow;"><td>NAME</td><td>AMOUNT</td><td>BUY</td></tr>

<%
ArrayList<Book> al = (ArrayList<Book>)session.getAttribute("BOOKS");
for(Book book : al)
{
	out.println("<form action='book_buy_process.jsp'>");
	out.println("<tr>");
	out.println("<td style='padding-right:30px;padding-left:30px;'>");
	out.println(book.getName());
	out.println("</td>");
	out.println("<td style='padding-right:30px;padding-left:30px;'>");
	out.println(book.getAmount());
	out.println("</td>");
	out.println("<td>");
	out.print("<input type='hidden' name='name' value='"+book.getName()+"'>");
	out.print("<input type='hidden' name='amount' value='"+book.getAmount()+"'>");
	out.println("<input style='color:blue;padding-left:40px;padding-right:40px;' type='submit' value = 'Buy'");
	out.println("</td>");
	out.println("</tr>");
	out.println("</td>");
	out.println("</form>");			

}
%>
</table>

<%@ include file="/WEB-INF/pages/footer.html"%>
</body>
</html>