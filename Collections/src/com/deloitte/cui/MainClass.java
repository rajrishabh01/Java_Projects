package com.deloitte.cui;

class Point<T>{
	private T x;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	private T y;
	
	
}


public class MainClass {

	public static void main(String[] args) {
		Point<Integer> point1 = new Point<Integer>();
		point1.setX(4);
		point1.setY(4);
		System.out.println(point1.getX() + " " + point1.getY());
		
		Point<Float> point2 = new Point<Float>();
		point2.setX(3.3f);
		point2.setY(4.4f);
		System.out.println(point2.getX() + " " + point2.getY());
		
		Point<String> point3 = new Point<String>();
		point3.setX("Why god why");
		
		System.out.println(point3.getX());
		
	}

}
