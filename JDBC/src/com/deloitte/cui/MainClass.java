package com.deloitte.cui;

import com.deloitte.daos.UserDAO;
import com.deloitte.entities.User;

public class MainClass {

	public static void main(String[] args) {
		User user = new User(1, "RishabhRaj", "Rishabh", "Raj", "rteam", "E");
		
		UserDAO udao = new UserDAO();
		udao.save(user);
	}

}
