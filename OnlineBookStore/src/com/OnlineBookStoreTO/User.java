package com.OnlineBookStoreTO;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class User {
	
	private String id;
	private String uname;
	private String email;
	private long phone;
	private String password;
	private InputStream is;
	private InputStream resume;
	private byte[] image;
	
	
	
	
	
	
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public InputStream getIs() {
		return is;
	}
	public void setIs(InputStream is) {
		this.is = is;
	}
	public InputStream getResume() {
		return resume;
	}
	public void setResume(InputStream resume) {
		this.resume = resume;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
