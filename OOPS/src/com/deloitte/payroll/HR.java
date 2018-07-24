package com.deloitte.payroll;

public class HR{

	public Employee recruit(char EmpType) {
		Employee e1 = null;
		
		if(EmpType=='I') {
			e1 = new Interns();
		}
		else if(EmpType=='P') {
			e1 = new ConfirmeedEmployee();
		}
		else if(EmpType=='C') {
			e1 = new ContractEmployee();
		}
		
		return e1;
		
	}

}
