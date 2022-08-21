package com.adminlogin.app.model;

import javax.persistence.Entity;

@Entity
public class AdminLoginModel {
	private String name;
	private String email;
	private long phone_number;
	private String password;
	
	public AdminLoginModel(String name, String email, long phone_number, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phone_number = phone_number;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
