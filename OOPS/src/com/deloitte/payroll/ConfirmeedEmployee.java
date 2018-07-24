package com.deloitte.payroll;

public class ConfirmeedEmployee extends Employee {

	
	public void transportFacility(){
		System.out.println("Transport allowed");
	}


	@Override
	public void netSalary() {
		// TODO Auto-generated method stub
		System.out.println("Confiremd Employee's Salary");
	}

}
