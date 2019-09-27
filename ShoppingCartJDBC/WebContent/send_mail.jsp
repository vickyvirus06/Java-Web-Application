<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*,java.io.IOException,java.util.Properties,javax.mail.Message,javax.mail.MessagingException,
javax.mail.Multipart,
javax.mail.PasswordAuthentication,
javax.mail.Session,
javax.mail.Transport,
javax.mail.internet.InternetAddress,
javax.mail.internet.MimeBodyPart,
javax.mail.internet.MimeMessage,
javax.mail.internet.MimeMultipart,
javax.net.ssl.SSLSession,com.Bean.*,java.sql.*,Util.*,com.Bean.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
String book_details="";

final String username="poojarivicky3@gmail.com";
final String password="virus1995";
ArrayList<Book> al = new ArrayList<Book>();

 void dataRetrieve()
{
	 try{
		 Connection con = JdbcUtil.getMysql();
			PreparedStatement pst = con.prepareStatement("Select * from user_books");
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Book book = new Book();
				book_details = book_details +"\n"+ "Book Id : " + rs.getString(1)+"\n"+"Book Name : "+rs.getString(2)+"\n"+"Book Price : "+rs.getString(5)+"\n\n";
				book.setId(rs.getString(1));
				book.setName(rs.getString(2));
				 book.setAmount(rs.getString(3));
				 book.setDiscount(rs.getString(4));
				 book.setTotal_pay(rs.getString(5));
				al.add(book);
			}	 
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 
	 
	 
		
}

 void databaseBooksAdd()
 {
	 try{
		 Connection con = JdbcUtil.getMysql();
			PreparedStatement pst = con.prepareStatement("insert into database_books values(?,?,?,?,?)");
			
			for(Book book : al)
			{
				pst.setString(1, book.getId());
				pst.setString(2, book.getName());
				pst.setString(3, book.getAmount());
				pst.setString(4, book.getDiscount());
				pst.setString(5, book.getTotal_pay());
				pst.addBatch();
			}
			pst.executeBatch();
			
			
			pst.clearBatch();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 
 }
 
 
 void userDataClear()
 {
	 try{
		 Connection con = JdbcUtil.getMysql();
			PreparedStatement pst = con.prepareStatement("delete from user_books");
			pst.executeUpdate();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	
 }

%>

<%
dataRetrieve();
final String toEmail = request.getParameter("email");
String amount = session.getAttribute("AMOUNT").toString();
String user_message = "Hello " + request.getParameter("name") + "\n" + book_details + "\n\n Total Amount :  " + amount;
Properties properties = new Properties();
properties.put("mail.smtp.auth", "true");
properties.put("mail.smtp.starttls.enable", "true");
properties.put("mail.smtp.host","smtp.gmail.com");
properties.put("mail.smtp.port", "587");




Session session_mail = Session.getInstance(properties, new javax.mail.Authenticator() {
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(username,password);
	}
});

MimeMessage msg = new MimeMessage(session_mail);
try {
	msg.setFrom(new InternetAddress(username));
	
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
		msg.setSubject("Vicky Book Centre");
		msg.setText(user_message);
	Transport.send(msg);
	
} catch (Exception e) {
	e.printStackTrace();
} 	
out.println("Thanks for Shopping");

session.removeAttribute("ADDTOCART");
session.removeAttribute("BOOKS");
databaseBooksAdd();

userDataClear();

book_details="";

request.getRequestDispatcher("home.jsp").include(request, response);


%>

</body>
</html>