<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,com.Bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	
	ArrayList<Book> java = new ArrayList<Book>();
	
	java.add(new Book("Core Java","360"));
	java.add(new Book("JDBC","480"));
	java.add(new Book("JSP","390"));
	java.add(new Book("Spring","380"));
	
	ArrayList<Book> sql = new ArrayList<Book>();
	sql.add(new Book("MYSQL","380"));
	sql.add(new Book("ORACLE SQL","480"));
	sql.add(new Book("PL/SQL","290"));
	
	
	ArrayList<Book> html = new ArrayList<Book>();
	html.add(new Book("HTML BASICS","340"));
	html.add(new Book("CSS","290"));
	html.add(new Book("Bootstrap","190"));
	
	String book = request.getParameter("programming");
	if(book.equals("java"))
	{
		session.setAttribute("BOOKS", java);
		request.getRequestDispatcher("book_buy.jsp").forward(request, response);
	}
	else if(book.equals("sql"))
	{
		session.setAttribute("BOOKS", sql);
		request.getRequestDispatcher("book_buy.jsp").forward(request, response);
	}
	else if(book.equals("html"))
	{
		session.setAttribute("BOOKS", html);
		request.getRequestDispatcher("book_buy.jsp").forward(request, response);
	}
	
	
%>


</body>
</html>