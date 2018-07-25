package com.deloitte.mainif;

public class Airport {

	public static void main(String[] args) {
		Airport DelhiAirport = new Airport();
		Helicopter H1 = new Helicopter();
		SeaPlane sp1 = new SeaPlane();
		
		DelhiAirport.givePermission(H1);
		DelhiAirport.givePermission(sp1);

	}

	private void givePermission(Flyer f) {
		f.land();
	}
}
