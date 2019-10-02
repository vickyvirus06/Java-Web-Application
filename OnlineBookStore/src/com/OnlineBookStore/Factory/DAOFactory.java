package com.OnlineBookStore.Factory;

import com.OnlineBookStore.DAO.BookDAO;
import com.OnlineBookStore.DAO.CheckOutDAO;
import com.OnlineBookStore.DAO.UserDAO;
import com.OnlineBookStore.DAOImplement.BookDAOImpl;
import com.OnlineBookStore.DAOImplement.CheckOutDAOImpl;
import com.OnlineBookStore.DAOImplement.UserDAOImpl;


public class DAOFactory {

	private static UserDAO userDAO = new UserDAOImpl();
	private static BookDAO bookDAO = new BookDAOImpl();
	private static CheckOutDAO checkOutDAO = new CheckOutDAOImpl();
	
	public static UserDAO getUserDAO() {
		
		return userDAO;
	}

	public static BookDAO getbookDAO() {
		// TODO Auto-generated method stub
		return bookDAO;
	}

	public static CheckOutDAO getCheckOutDAO() {
		// TODO Auto-generated method stub
		return checkOutDAO;
	}

}
