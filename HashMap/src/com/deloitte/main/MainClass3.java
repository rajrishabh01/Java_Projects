package com.deloitte.main;

class IllegalAgeException extends Exception{
	public String getMessage() {
		return "18+ only";
	}
}

class Voter{
	public void register(int age) throws IllegalAgeException {
		if(age<18) {
			throw new IllegalAgeException();
		}
	}
}


public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Voter voter = new Voter();
		
		try {
			voter.register(16);
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
