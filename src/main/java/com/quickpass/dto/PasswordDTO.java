package com.quickpass.dto;

public class PasswordDTO {
	private int passwordId;
	private String userId;
	private String website;
	private String password;
	
	
	public int getPasswordId() {
		return passwordId;
	}
	public void setPasswordId(int passwordId) {
		this.passwordId = passwordId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return passwordId + " " + userId + " " + password;

	}
	
}
