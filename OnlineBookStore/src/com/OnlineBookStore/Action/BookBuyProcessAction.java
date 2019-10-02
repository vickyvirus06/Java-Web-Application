package com.OnlineBookStore.Action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineBookStoreTO.Book;

public class BookBuyProcessAction {

	public void process_books(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			request.getSession().setAttribute("BOOKS", java);
			request.getRequestDispatcher("book_buy_def.jsp").forward(request, response);
		}
		else if(book.equals("sql"))
		{
			request.getSession().setAttribute("BOOKS", sql);
			request.getRequestDispatcher("book_buy_def.jsp").forward(request, response);
		}
		else if(book.equals("html"))
		{
			request.getSession().setAttribute("BOOKS", html);
			request.getRequestDispatcher("book_buy_def.jsp").forward(request, response);
		}
		
	}

}
