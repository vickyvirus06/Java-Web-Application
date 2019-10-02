package com.OnlineBookStore.Action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineBookStore.Delegate.BookDelegate;
import com.OnlineBookStoreTO.Book;

public class BookCartAction {

	public void displayCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int amount = 0;
		ArrayList<Book> al = BookDelegate.getBooks();
		for(Book book : al)
		{
			amount = Integer.parseInt(book.getTotal_pay())+amount;
		}
		
		request.getSession().setAttribute("BOOKCART",al);
		request.getSession().setAttribute("TOTALAMOUNT",amount);
		
		request.getRequestDispatcher("books_cart_def.jsp").forward(request, response);;
		
	}

}
