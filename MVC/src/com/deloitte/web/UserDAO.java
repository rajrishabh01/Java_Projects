package com.deloitte.web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public interface UserDAO {
	public default void Insert(UserBean user) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {

			DataSource ds = null;
			try {
				Context initCtx = new InitialContext();
				Context envCtx = (Context) initCtx.lookup("java:comp/env");
				ds = (DataSource)envCtx.lookup("jdbc/TeamDB");
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    
			Connection connection1 = ds.getConnection();
		
			ps =connection1.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?,?)");
		
			
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			
			
			ps.executeUpdate();
			
			ps.close();
			
			connection1.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				
				if(ps!=null && !ps.isClosed()) {
				
					ps.close();
					}
				if(connection!=null && !connection.isClosed()) {
					
					connection.close();
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
