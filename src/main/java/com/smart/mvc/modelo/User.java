package com.smart.mvc.modelo;

public class User {
	private String username;
	private String pass;
	
	private User(){
		super();
	}
	private User(String username, String pass){
		this.username=username;
		this.pass=pass;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
