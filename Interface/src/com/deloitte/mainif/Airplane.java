package com.deloitte.mainif;

public class Airplane extends Vehicle implements Flyer {

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
