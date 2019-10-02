package com.OnlineBookStoreFrontController;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineBookStore.Action.BookBuyAction;
import com.OnlineBookStore.Action.BookBuyProcessAction;
import com.OnlineBookStore.Action.BookCartAction;
import com.OnlineBookStore.Action.BookDatabaseAddAction;
import com.OnlineBookStore.Action.CheckoutAction;

import com.OnlineBookStore.Action.LoginAction;
import com.OnlineBookStore.Action.LogoutAction;
import com.OnlineBookStore.Action.ProfileAction;
import com.OnlineBookStore.Action.RegisterAction;
import com.OnlineBookStore.Action.RemoveProcessAction;
import com.OnlineBookStore.Action.SendMailAction;


/**
 * Servlet implementation class FrontController
 */

@WebServlet("/")
@javax.servlet.annotation.MultipartConfig
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginAction login_action = null;
	ProfileAction profile_action = null;
	BookBuyProcessAction book_process_action = null;
	BookBuyAction book_buy_action = null;
	BookDatabaseAddAction book_addDatabase =  null;
	BookCartAction book_cart_action = null;
	RemoveProcessAction remove_action = null;
	CheckoutAction checkout_action = null;
	SendMailAction send_mail_action = null;
	RegisterAction register_action = null;
	LogoutAction logout_action = null;
	
	
	public void init() throws ServletException {
    	login_action=new LoginAction();
    	profile_action = new ProfileAction();
    	book_process_action = new BookBuyProcessAction();
    	book_buy_action = new BookBuyAction();
    	book_addDatabase = new BookDatabaseAddAction();
    	book_cart_action = new BookCartAction();
    	remove_action = new RemoveProcessAction();
    	checkout_action = new CheckoutAction();
    	send_mail_action = new SendMailAction();
    	register_action = new RegisterAction();
    	logout_action = new LogoutAction();
    	
	}
    
    
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String req_uri = request.getRequestURI();
		if(req_uri.endsWith("login"))
		{
			
			login_action.verify(request, response);
		}
		else if(req_uri.endsWith("register"))
		{
			register_action.addUser(request,response);
		}
		else if(req_uri.endsWith("profile"))
		{
			profile_action.showProfile(request,response);
		}
		else if(req_uri.endsWith("book_buy_process"))
		{
			book_process_action.process_books(request,response);
		}
		else if(req_uri.endsWith("book_buy"))
		{
			book_buy_action.buy_books(request,response);
		}
		else if(req_uri.endsWith("book_add"))
		{
			book_addDatabase.addBook(request,response);
		}
		else if(req_uri.endsWith("books_cart"))
		{
			book_cart_action.displayCart(request,response);
		}
		else if(req_uri.endsWith("remove_process"))
		{
			remove_action.removeBook(request,response);
		}
		else if(req_uri.endsWith("checkout_process"))
		{
			checkout_action.checkout(request,response);
		}
		else if(req_uri.endsWith("send_mail"))
		{
			send_mail_action.send(request,response);
		}
		else if(req_uri.endsWith("logout"))
		{
			logout_action.logout(request,response);
		}
	}

}
