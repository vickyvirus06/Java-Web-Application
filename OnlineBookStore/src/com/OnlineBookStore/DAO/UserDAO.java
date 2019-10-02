package com.OnlineBookStore.DAO;


import com.OnlineBookStoreTO.User;

public interface UserDAO {

	boolean verifyUser(String username,String password);

	boolean addNewUser(User user);

	User getUserDetails(String uname,String pword);

	

	
}
