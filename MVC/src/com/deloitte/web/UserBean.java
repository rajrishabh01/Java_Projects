package com.deloitte.web;

import java.io.Serializable;

public class UserBean implements Serializable {
	
	private String firstName;
	private String lastName;
	
	
	
	
	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public boolean authenticate(String username, String passwd) {
		if (username != null && passwd != null) {
			if (username.equalsIgnoreCase("raj") && passwd.equals("rteam")) {
				firstName = "rishabh";
				lastName = "raj";
				return true;
			}
			else {
				return false;
			}

	}
		return false;
	}
}
