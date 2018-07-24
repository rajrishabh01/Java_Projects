package com.deloitte.payroll.main;

import java.util.Scanner;

import com.deloitte.payroll.Accounts;
import com.deloitte.payroll.ConfirmeedEmployee;
import com.deloitte.payroll.ContractEmployee;
import com.deloitte.payroll.Employee;
import com.deloitte.payroll.HR;
import com.deloitte.payroll.Interns;

public class MainClass {

	public static void main(String[] args) {
			Accounts a1 = new Accounts();
			
			
			
			HR hr = new HR();
			
			Scanner sc = new Scanner(System.in);
			
			
			Employee e2 = hr .recruit('P');
			
			a1.processSalary(e2);
			
			
			
	}

}
