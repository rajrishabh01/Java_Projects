package com.deloitte.pojo;

public class Point {
	
	private int X;
	private int Y;
	
	
	

	@Override
	public String toString() {
		return X+" "+Y;
	}




	public Point() {
		System.out.println("Point instantiated.");
	}




	public int getX() {
		return X;
	}




	public void setX(int x) {
		X = x;
		System.out.println("Set X");

	}




	public int getY() {
		return Y;
	}




	public void setY(int y) {
		Y = y;
		System.out.println("Set Y");

	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
