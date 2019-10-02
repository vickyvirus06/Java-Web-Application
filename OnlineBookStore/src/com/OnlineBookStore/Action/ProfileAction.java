package com.OnlineBookStore.Action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineBookStore.Delegate.UserDelegate;
import com.OnlineBookStoreTO.User;

public class ProfileAction {

	public void showProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("helloooo");
		String uname = (String)request.getSession().getAttribute("USERNAME");
		String pword = (String)request.getSession().getAttribute("PASSWORD");
		
		User user = UserDelegate.getUserDetails(uname,pword);
		
		request.setAttribute("USERDETAILS", user);
		
		request.getRequestDispatcher("user_profile_def.jsp").forward(request, response);
		
		
	}

}
