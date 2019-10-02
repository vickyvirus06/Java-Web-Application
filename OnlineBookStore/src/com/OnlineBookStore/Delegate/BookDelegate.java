package com.OnlineBookStore.Delegate;

import java.util.ArrayList;

import com.OnlineBookStore.DAO.BookDAO;
import com.OnlineBookStore.DAO.UserDAO;
import com.OnlineBookStore.Factory.DAOFactory;
import com.OnlineBookStoreTO.Book;

public class BookDelegate {

static BookDAO bookDAO=null;
	
	static{
		bookDAO=DAOFactory.getbookDAO();
	}

	
	public static boolean addBook(Book book) {
		// TODO Auto-generated method stub
		return bookDAO.addBook(book);
	}


	public static ArrayList<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookDAO.getBook();
	}


	public static boolean removeBook(String id,String name) {
		return bookDAO.removeBook(id,name);
		
	}
}
