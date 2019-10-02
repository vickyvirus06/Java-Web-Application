package com.OnlineBookStore.Validator;



public class Validator {
	public static boolean validate(String uname) {
		boolean valid=false;
		if(uname !=null && uname.trim().length()!=0){
			valid=true;
		}
		return valid;
	}
}
