package com.test.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username ;
	private String password ;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public void validate() {
		
		if("".equals(this.getUsername().trim()) || "".equals(this.getPassword().trim())){
			this.addFieldError("username", "username or password required !") ;
		}
		
	}
	
	
}
