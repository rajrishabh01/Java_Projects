package com.deloitte.test;

import java.util.Scanner;

public class Calculator {

	public Calculator() {
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		System.out.println("Give Choice");
		System.out.println("1.Addition 2.Substraction 3.Multiply 4.Divide");
		choice = sc.nextInt();

		Arthimetic[] arth = { new Addition(0, 0, 0), new Subtraction(0, 0, 0), new Multiply(0, 0, 0),
				new Divison(0, 0, 0) };

		arth[choice - 1].read();
		
		try {
			arth[choice - 1].calculate();
			arth[choice - 1].display();
		}
		catch(ArithmeticException e){
			System.out.println("Division by 0 not possible");
			
		}
		finally {
			sc.close();
		}

	}

	public static void main(String[] args) {

		new Calculator();

	}

}