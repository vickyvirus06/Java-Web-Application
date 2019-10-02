package com.OnlineBookStore.Action;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.OnlineBookStore.Delegate.UserDelegate;
import com.OnlineBookStore.Validator.Validator;
import com.OnlineBookStoreTO.User;
@javax.servlet.annotation.MultipartConfig
public class RegisterAction {
	InputStream input_stream_photo = null;
	InputStream input_stream_resume = null;
	public void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		Part photo = request.getPart("photo");
		input_stream_photo = photo.getInputStream();
		Part resume = request.getPart("resume");
		input_stream_resume = resume.getInputStream();
		
		
		
		
boolean dbinteract=true;
		
		if(!Validator.validate(uname)){
			request.setAttribute("username", "UserName Required");
			dbinteract=false;
		}
		if(!Validator.validate(email)){
			request.setAttribute("email", "Email is Required");
			dbinteract=false;
		}
		if(!Validator.validate(phone)){
			request.setAttribute("phone", "Phone is Required");
			dbinteract=false;
		}
		if(!Validator.validate(password)){
			request.setAttribute("password", "Password is Required");
			dbinteract=false;
		}
		
		try {
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	    
	    long ph=0;
		if(phone!=null && phone.trim().length()!=0){
		ph=Long.parseLong(phone);
		}
		
		if(dbinteract){
			User user = new User();
			user.setUname(uname);
			user.setEmail(email);
			user.setPhone(ph);
			user.setPassword(password);
			user.setIs(input_stream_photo);
			user.setResume(input_stream_resume);
			
			boolean result=UserDelegate.addUser(user);
			if(result){
				request.setAttribute("reg_error", "User Registered Successfully...");
				request.getRequestDispatcher("register_user_def.jsp").forward(request, response);
			}else{
				request.setAttribute("reg_error", "User Registration Failed Try Again...");
				request.getRequestDispatcher("register_user_def.jsp").forward(request, response);
			}
		}else{
			request.getRequestDispatcher("register_user_def.jsp").forward(request, response);
		}
		

		
	}

}
