package com.deloitte.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmplyeeMain {

	public EmplyeeMain() {

	}

	public static void main(String[] args) {
		EmplyeeBo b = new EmplyeeBo();
		EmplyeeSort s = new EmplyeeSort();

		Scanner sc = new Scanner(System.in);

		System.out.println("Employees to be added ");
		int number = sc.nextInt();

		ArrayList<EmplyeeVo> list = new ArrayList<EmplyeeVo>();

		try {
			for (int i = 0; i < number; i++) {
				System.out.println("enter Employee's ID"+(i+1));
				int id = sc.nextInt();
				System.out.println("enter The Employee's Name "+(i+1));
				String EmpName = sc.next();
				System.out.println("enter The Annual Income"+(i+1));
				double annual = sc.nextDouble();
				list.add(new EmplyeeVo(id, EmpName, annual, 0));
				b.CalincomeTax(list.get(i));
			}
		} catch (Exception e) {
			
			System.out.println("enter correctly");
		}
		
		for (EmplyeeVo emplyeeVo : list) {
			System.out.println(emplyeeVo);
		}
		Collections.sort(list, s);
		
		System.out.println("The New Sorted List - ");
		for (EmplyeeVo emplyeeVo : list) {
			System.out.println(emplyeeVo);
		}
		sc.close();

	}

}