package com.deloitte.payroll;

public class Accounts {
		
		public void processSalary(Employee e1){
			
			if(e1 instanceof ConfirmeedEmployee) {
				ConfirmeedEmployee ce1= (ConfirmeedEmployee)e1;
				ce1.transportFacility();
			}
			e1.netSalary();
		}
}
