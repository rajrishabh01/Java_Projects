package com.deloitte.mainif;

public class Superman extends Kryptonian implements Flyer {
	
	public void leapBuildings() {
		System.out.println("Leap Buildings");

	}
	
	public void stopBullets() {
		System.out.println("Stop Bullets");

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
