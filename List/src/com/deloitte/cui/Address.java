package com.deloitte.cui;

public class Address implements Comparable<String>{
	
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	


	public Address(String name, String street, String city, String state, String code) {
		
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.code = code;
	}

	@Override
	public String toString() {
		return name + "\n" + street + "\n" + city + " " +state + " " + code;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public boolean equals(Object o) {
		
		        if ((o instanceof Address) && (((Address) o).toString() == this.toString())) {
		            return true;
		        } else {
		            return false;
		        }
		    
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
