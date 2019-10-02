package com.OnlineBookStore.DAOImplement;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.OnlineBookStore.DAO.UserDAO;
import com.OnlineBookStore.Util.JdbcUtil;
import com.OnlineBookStoreTO.User;

public class UserDAOImpl implements UserDAO{
Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;

	@Override
	public boolean verifyUser(String username, String password) {
		try
		{
			con = JdbcUtil.getMysql();
			pst = con.prepareStatement("Select * from users where username=? and password = ?");
			pst.setString(1, username);
			pst.setString(2, password);
			rs = pst.executeQuery();
			while(rs.next())
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return false;
	}

	@Override
	public boolean addNewUser(User user) {
		String uid = getId();
		try {
			
		    
	        
		
			con = JdbcUtil.getMysql();
			pst = con.prepareStatement("Insert into users values(?,?,?,?,?,?,?)");
			pst.setString(1, uid);
			pst.setString(2, user.getUname());
			pst.setString(3, user.getEmail());
			pst.setLong(4, user.getPhone());
			pst.setString(5, user.getPassword());
			pst.setBlob(6, user.getIs());
			pst.setBlob(7, user.getResume());
			int res = pst.executeUpdate();
			
			if(res>0)
			{
				return true;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public String getId()
	{
		String uid = "U-";
		try 
		{
			con=JdbcUtil.getMysql();
			String query = "Select count(id) from users";
			pst = con.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next()) {
			
			uid = uid+(rs.getInt(1)+1);
			
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return uid;
	}

	@Override
	public User getUserDetails(String uname,String pword) {
		Blob image = null;
		byte[] image_data = null;
		try {
			con = JdbcUtil.getMysql();
			pst = con.prepareStatement("Select * from users where username = ? and password = ? ");
			pst.setString(1, uname);
			pst.setString(2, pword);
			rs = pst.executeQuery();
			while(rs.next())
			{
				User user = new User();
				user.setId(rs.getString(1));
				user.setUname(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setPhone(rs.getLong(4));
				image = rs.getBlob(5);
				image_data = image.getBytes(1, (int)image.length());
				user.setImage(image_data);
				
				return user;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	

}
