package com.OnlineBookStore.Action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineBookStore.Delegate.UserDelegate;
import com.OnlineBookStore.Validator.Validator;


public class LoginAction {
	
	public void verify(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String uname=req.getParameter("username");
		String pword=req.getParameter("password");
		
boolean dbinteract=true;
		
		if(!Validator.validate(uname)){
			req.setAttribute("uname", "UserName Required");
			dbinteract=false;
		}
		
		if(!Validator.validate(pword)){
			req.setAttribute("pword", "Password is Required");
			dbinteract=false;
		}
		
		
		
		if(dbinteract){
			boolean result=UserDelegate.verifyUser(uname,pword);
			if(result){
				req.getSession().setAttribute("USERNAME", uname);
				req.getSession().setAttribute("PASSWORD", pword);
				
				req.getRequestDispatcher("user_home_def.jsp").include(req, res);
			}else{
				req.setAttribute("logon_error", "Invalid UserName or Password...");
				req.getRequestDispatcher("index.jsp").forward(req, res);
			}
		}else{
			req.getRequestDispatcher("index.jsp").forward(req, res);
		}
		

				
	}
}
