package com.github.rgmatute91.web.rest.vm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ResponseVM {
	
	private String username;
	
	private String message;
	
	public String getUsername() {
		return this.username;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

}
