package com.github.rgmatute91.web.rest.vm;

import lombok.Data;

@Data
public class UserVM {

	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String address;

}
