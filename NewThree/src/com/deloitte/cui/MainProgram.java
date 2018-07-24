package com.deloitte.cui;


class Point{
	public int x;
	public int y;
}

public class MainProgram {

public static void main(String[] args) {
	
	
	Point[] points = new Point[3];
	
	points[0] = new Point();
	points[1] = new Point();
	points[2] = new Point();
	
	points[0].x = 3; 
	points[0].y = 33; 
	points[1].x = 34; 
	points[1].y = 36; 
	points[2].x = 7; 
	points[2].y = 1; 
	
	for(Point point:points) {
		if(point!=null) {
			System.out.println(point.x +" "+ point.y);
		}
	}
	
	
}

}
