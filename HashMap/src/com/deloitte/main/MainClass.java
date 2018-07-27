package com.deloitte.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		HashMap<Integer, String> result = new HashMap<>();
		
		result.put(1, "A");
		result.put(2, "B");
		result.put(3, "C");
		result.put(4, "D");

		System.out.println(result.size());
		System.out.println(result.get(2));
		
		Set<Integer> keys = result.keySet();
		
		for(int key:keys) {
			System.out.println(key + "-" + result.get(key));
		}
		
		Iterator<Integer> iterator = keys.iterator();
		Integer key;
		
		while(iterator.hasNext()) {
			key = iterator.next();
			System.err.println(key + "-" + result.get(key) );
		}
	}

}
