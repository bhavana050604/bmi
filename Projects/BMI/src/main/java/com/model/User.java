package com.model;

import javax.ejb.Stateless;
import javax.validation.constraints.NotNull;

@Stateless
public class User {
	@NotNull 
	String username;
	@NotNull
	String email;
	@NotNull
	String password;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
