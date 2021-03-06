package com.deloitte.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.deloitte.entities.User;
import com.deloitte.pattern.Dao;

public class UserDAO implements Dao<User> {

	@Override
	public User get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User user) {
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
		
			ps.setInt(1, user.getId());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getFirstName());
			ps.setString(4, user.getLastName());
			ps.setString(5, user.getPasswd());
			ps.setString(6, user.getStatus());
			
			
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

	@Override
	public void update(User t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User t) {
		// TODO Auto-generated method stub
		
	}
	
}
