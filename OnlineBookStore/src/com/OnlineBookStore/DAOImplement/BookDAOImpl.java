package com.OnlineBookStore.DAOImplement;

import java.sql.*;
import java.util.ArrayList;

import com.OnlineBookStore.DAO.BookDAO;
import com.OnlineBookStore.Util.JdbcUtil;
import com.OnlineBookStoreTO.Book;

public class BookDAOImpl implements BookDAO{
Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;
String id = null;
	@Override
	public boolean addBook(Book book) {
		
		try
		{
			con = JdbcUtil.getMysql();
			id = getId();
			String query = "Insert into user_books values(?,?,?,?,?)";
			pst = con.prepareStatement(query);
			pst.setString(1, id);
			pst.setString(2, book.getName());
			pst.setString(3, book.getAmount());
			pst.setString(4, book.getDiscount());
			pst.setString(5, book.getTotal_pay());
			int res = pst.executeUpdate();
			if(res>0)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	
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


	@Override
	public ArrayList<Book> getBook() {
		ArrayList<Book> al = new ArrayList<Book>();
		
		try {
			con = JdbcUtil.getMysql();
			String query = "Select * from user_books";
			pst = con.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next())
			{
				Book book = new Book();
				book.setId(rs.getString(1));
				book.setName(rs.getString(2));
				book.setAmount(rs.getString(3));
				book.setDiscount(rs.getString(4));
				book.setTotal_pay(rs.getString(5));
				al.add(book);
			}
			
			return al;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public boolean removeBook(String id,String name) {
		try
		{
			con = JdbcUtil.getMysql();
			String query = "delete from user_books where id = ? and name = ?";
			
			pst = con.prepareStatement(query);
			pst.setString(1, id);
			pst.setString(2, name);
			int res = pst.executeUpdate();
			if(res>0)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}


}
