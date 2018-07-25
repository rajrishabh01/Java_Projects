package com.deloitte.mainif;

public class Bird extends Animal implements Flyer {

	public void buildNest() {
		System.out.println("Building Nest");

	}
	
	public void layEggs() {
		System.out.println("Lays Eggs");

	}
	
	@Override
	public void takeOff() {
		System.out.println("Taking off");
	}

	@Override
	public void fly() {
		System.out.println("Flying");

	}

	@Override
	public void land() {
		System.out.println("landing");

	}

}
