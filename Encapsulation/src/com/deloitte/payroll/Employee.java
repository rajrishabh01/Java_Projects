package com.deloitte.payroll;

import static javax.swing.JOptionPane.*;

public class Employee {
	
	private int empID;
	private String fname;
	private String lname;
	private int deptId;
	

	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public static void main(String[] args) {
		showMessageDialog(null, "Su Prabhat", "Training", 0);
	}

}
