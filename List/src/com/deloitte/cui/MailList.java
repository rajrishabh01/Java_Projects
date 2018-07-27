package com.deloitte.cui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class MailList {

	public static void main(String[] args) {
		HashSet<Address> m1 = new HashSet<Address>();
		m1.add(new Address("JW West", "11 Oak Ave", "Urbana", "IL", "61801"));
		
		m1.add(new Address("JW West", "11 Oak Ave", "Urbana", "IL", "61801"));
		
		m1.add(new Address("Ralph ", "1142 Maple Ave", "Mahome", "IL", "61851"));
		m1.add(new Address("Tom Carlton	", "867 Elm st", "champaign", "IL", "61820"));
	
		Iterator<Address> itr = m1.iterator();
	    while(itr.hasNext()) { 
		      Address element = itr.next(); 
		      System.out.print(element + " "); 
		    } 
		    System.out.println();
	}

}
