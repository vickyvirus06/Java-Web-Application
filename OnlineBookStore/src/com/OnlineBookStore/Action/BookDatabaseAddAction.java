package com.OnlineBookStore.Action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineBookStore.Delegate.BookDelegate;
import com.OnlineBookStoreTO.Book;

public class BookDatabaseAddAction {

	public void addBook(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Integer discount = 20;
		Integer total_discount =0;
		Integer total_pay =0;
		String name = request.getParameter("name");
		String amount = request.getParameter("amount");
		Integer amt = Integer.parseInt(amount);
		
		total_discount = amt*discount/100;
		total_pay = amt-total_discount;
		
		
		Book book = new Book();
		book.setName(name);
		book.setAmount(amount);
		book.setDiscount(discount.toString());
		book.setTotal_pay(total_pay.toString());
		
		boolean flag = BookDelegate.addBook(book);
		
		if(flag)
		{
			response.sendRedirect("book_buy_def.jsp");
		}
	}

}
