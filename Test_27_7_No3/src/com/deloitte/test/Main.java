package com.deloitte.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Enter arr size ");
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		
		boolean b=false;
		
		for(int i=0;i<n;i++){ 
			System.out.println("Enter Index Value: "+i);
		 
			arr[i]=sc.nextInt();
		}
		
		b=UserMainCode.checkTriplets(arr);
		
		System.out.println(b);

		
		
	}

}
