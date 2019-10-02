package com.OnlineBookStore.DAOImplement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.OnlineBookStore.DAO.CheckOutDAO;
import com.OnlineBookStore.Util.JdbcUtil;
import com.OnlineBookStoreTO.Book;

public class CheckOutDAOImpl implements CheckOutDAO{
	String book_details="";

	final String username="poojarivicky3@gmail.com";
	final String password="virus1995";
	ArrayList<Book> al = new ArrayList<Book>();
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;


	@Override
	public String clear() {
		dataRetrieve();
		databaseBooksAdd();
		userDataClear();
		return book_details;
	}

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


}
