package com.isuHabitatForHumanity.comm223.model;

public class Admin {
	private String username;
	private String password;
	
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String newUsername)
	{
		username = newUsername;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String newPassword)
	{
		password = newPassword;
	}
	
	public Admin(String user, String pass)
	{
		this.setUsername(user);
		//password strength requirement?
		this.setPassword(pass);
	}

}
