package com.deloitte.web;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

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




	public boolean authenticate(String username, String passwd) throws NamingException, SQLException {
		
		
		
		if (username != null && passwd != null) {
			
			
			
			if (username.equalsIgnoreCase("raj") && passwd.equals("rteam")) {
				
				Context initCtx = new InitialContext();
				Context envCtx = (Context) initCtx.lookup("java:comp/env");
				DataSource ds = (DataSource)envCtx.lookup("jdbc/TeamDB");

				Connection conn = ds.getConnection();
				
				
				firstName = "rishabh";
				
				lastName = "raj";
				
				conn.close();
				return true;
			}
			else {
				return false;
			}
			

	}
		return false;
	}
}
