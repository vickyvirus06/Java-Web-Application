package com.OnlineBookStore.Action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutAction {

	public void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().invalidate();
		request.setAttribute("LOGOUTMESSAGE", "Logout Successfully");
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

}
