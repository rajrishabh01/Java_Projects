package com.deloitte.exception;

public class MainClass {

	public static void main(String[] args) {
	
		try {
			System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
			System.out.println("End");
		}catch (ArithmeticException e) {
			System.out.println("wrong!");
		}catch (NumberFormatException e) {
			System.out.println("Not allowed");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Only 2 numbers, idiot");
}

	}

}
