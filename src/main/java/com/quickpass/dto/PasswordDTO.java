package com.quickpass.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
//import org.springframework.stereotype.Component;


@Entity
public class PasswordDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int passwordId;
	private int userId;
	private String website;
	private String password;
	
	
	public int getPasswordId() {
		return passwordId;
	}
	public void setPasswordId(int passwordId) {
		this.passwordId = passwordId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
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
