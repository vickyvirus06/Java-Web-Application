package com.OnlineBookStore.Action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineBookStore.Delegate.CheckoutDelegate;
import com.OnlineBookStore.Mail.SendMail;

public class SendMailAction {

	public void send(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String book_details = CheckoutDelegate.clearData();
		
		String toEmail = request.getParameter("email");
		String amount = request.getSession().getAttribute("TOTALAMOUNT").toString();
		String user_message = "Hello " + request.getParameter("name") + "\n" + book_details + "\n\n Total Amount :  " + amount;
		boolean flag = SendMail.sendMail(toEmail,amount,user_message);
		
		if(flag)
		{
			request.setAttribute("FINALMSG","Thanks for Shopping");

			request.getSession().removeAttribute("ADDTOCART");
			request.getSession().removeAttribute("BOOKS");
			request.getSession().removeAttribute("BOOKCART");
			request.getSession().removeAttribute("TOTALAMOUNT");
			book_details="";

			request.getRequestDispatcher("user_home_def.jsp").include(request, response);

		}
	}

}
