package com.testing.services;

public class UserService {
	public boolean isValidUser(String username, String password) 
	    {
		  
	        return username.equalsIgnoreCase(password);
	    }


}
