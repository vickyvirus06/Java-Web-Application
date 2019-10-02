package com.OnlineBookStore.Action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineBookStore.Delegate.BookDelegate;

public class RemoveProcessAction {

	public void removeBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		boolean flag = BookDelegate.removeBook(id,name);
		
		if(flag)
		{
			request.getRequestDispatcher("books_cart").forward(request, response);
		}
	}

}
