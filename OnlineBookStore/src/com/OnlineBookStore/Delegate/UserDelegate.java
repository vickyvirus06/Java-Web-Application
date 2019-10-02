package com.OnlineBookStore.Delegate;

import com.OnlineBookStore.DAO.UserDAO;
import com.OnlineBookStore.Factory.DAOFactory;
import com.OnlineBookStoreTO.User;

public class UserDelegate {

static UserDAO userDAO=null;
	
	static{
		userDAO=DAOFactory.getUserDAO();
	}

	
	public static boolean verifyUser(String uname, String pword) {
		// TODO Auto-generated method stub
		return userDAO.verifyUser(uname,pword);
	}


	public static boolean addUser(User user) {
		
		return userDAO.addNewUser(user);
	}


	public static User getUserDetails(String uname, String pword) {
		// TODO Auto-generated method stub
		return userDAO.getUserDetails(uname,pword);
	}
}
