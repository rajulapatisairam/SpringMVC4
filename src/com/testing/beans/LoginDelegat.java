package com.testing.beans;

import com.testing.services.UserService;

public class LoginDelegat
{
	private UserService userService;

	public UserService getUserService()
	{
		return this.userService;
	}

	public void setUserService(UserService userService)
	{
		this.userService = userService;
	}

	public boolean isValidUser(String username, String password) 
	{
	    return userService.isValidUser(username, password);
	}
}

