package com.OnlineBookStore.Action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookBuyAction {

	public void buy_books(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("book_buy_def.jsp").forward(request, response);
		
	}

}
