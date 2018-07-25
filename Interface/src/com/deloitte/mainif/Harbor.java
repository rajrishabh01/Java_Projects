package com.deloitte.mainif;

public class Harbor {

	public static void main(String[] args) {
		Harbor bostonHarbor = new Harbor();
		RiverBarge barge = new RiverBarge();
		SeaPlane splane = new SeaPlane();
		
		bostonHarbor.givePermission(barge);
		bostonHarbor.givePermission(splane);
	}
	
	public void givePermission(Sailer s) {
		s.dock();
	}

}
