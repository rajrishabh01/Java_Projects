package com.deloitte.cui;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

class DBAccess{
	public Collection<String> getResult(){
		HashSet<String> result = new HashSet<String>();
		
		result.add("Why");
		result.add("god");
		result.add("Why");
		result.add("!");
		result.add("?");

		return result;
	}
}

public class MainClass {

	public static void main(String[] args) {
		DBAccess dba = new DBAccess();
		
		System.out.println(dba.getResult());
		
		//Activity 1
		
		LinkedList<String> result1 = new LinkedList<String>();
		
		result1.add("B");
		result1.add("C");
		result1.add("D");
		result1.add("X");
		result1.add("Y");
		result1.addFirst("A");
		result1.addLast("Z");
		
		result1.add(1, "A2");
		
		System.out.println("Original Contents are " + result1);
		
		result1.remove("F");
		result1.remove(2);
		
		System.err.println("Contents after deletion " + result1);
		
		result1.removeFirst();
		result1.removeLast();
		
		System.err.println("results after first and last " + result1);
		
		String val = result1.get(2);
		result1.set(2, val + " Changed");
		
		System.err.println("Changed " + result1);
		//Activity 2
		
		ArrayDeque<String> adq = new ArrayDeque<String>();
		
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");

		System.out.println("Popping now");
		
		while (adq.peek()!= null) {
			System.out.println(adq.pop()+" ");
		}
		System.out.println();
		
		//Activity 3
		ArrayList<String> al = new ArrayList<String>(); 
	     
	    // Add elements to the array list. 
	    al.add("C"); 
	    al.add("A"); 
	    al.add("E"); 
	    al.add("B"); 
	    al.add("D"); 
	    al.add("F"); 
	 
	    // iterate through the list
	    System.out.print("Original contents of al: "); 

	    Iterator<String> itr = al.iterator(); 
	    while(itr.hasNext()) { 
	      String element = itr.next(); 
	      System.out.print(element + " "); 
	    } 
	    System.out.println(); 
	 
	    // Modify objects being iterated. 
	    ListIterator<String> litr = al.listIterator();  
	    while(litr.hasNext()) { 
	      String element = litr.next(); 
	      litr.add(element + "+"); 
	    } 
	 
	    System.out.print("Modified contents of al: "); 
	    itr = al.iterator();  
	    while(itr.hasNext()) { 
	      String element = itr.next(); 
	      System.out.print(element + " "); 
	    } 
	    System.out.println(); 
	 
	    // Now, display the list backwards. 
	    System.out.print("Modified list backwards: "); 
	    while(litr.hasPrevious()) { 
	      String element = litr.previous(); 
	      System.out.print(element + " "); 
	    } 
	    System.out.println();
			
			
		}
	}


