package com.deloitte.test;

public class Divison extends Arthimetic {

	public Divison(int num1, int num2, int num3) {
		super(num1, num2, num3);
		
	}

	@Override
	void calculate(){
		num3=num1/num2;
		
	}

}