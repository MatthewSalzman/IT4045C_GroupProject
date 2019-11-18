package com.quickpass.dao;

public class PasswordDAO {
	private String userId;
	private String website;
	private String password;
	private String securityQ;
	
	public PasswordDAO(String UserID, String URL, String Password, String SecurityQuestion)
	{
		this.userId = UserID;
		this.website = URL;
		this.password = Password;
		this.securityQ = SecurityQuestion;
	}
}
