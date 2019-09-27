<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*,com.Bean.*,java.sql.*,Util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! 
Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;
String id = null;
public String getId()
{
	String bid = "B-";
	try 
	{
		con=JdbcUtil.getMysql();
		String query = "Select count(id) from user_books";
		pst = con.prepareStatement(query);
		rs = pst.executeQuery();
		while(rs.next()) {
		
		bid = bid+(rs.getInt(1)+1);
		
		}
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return bid;
}

%>
<%
	Integer discount = 30;
	Integer total_discount =0;
	Integer total_pay =0;
	String name = request.getParameter("name");
	String amount = request.getParameter("amount");
	Integer amt = Integer.parseInt(amount);
	
	con = JdbcUtil.getMysql();
	id = getId();
	String query = "Insert into user_books values(?,?,?,?,?)";
	pst = con.prepareStatement(query);
	pst.setString(1, id);
	pst.setString(2, name);
	pst.setString(3, amount);
	total_discount = amt*discount/100;
	total_pay = amt-total_discount;
	pst.setString(4, discount.toString());
	pst.setString(5, total_pay.toString());
	pst.executeUpdate();
	 
 	response.sendRedirect("book_buy.jsp");
%>
</body>
</html>