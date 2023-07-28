package com.ofss.main;

import com.ofss.domain.Employee;

public class EmployeeMainV3 {
	public static void main(String[] args) {
		System.out.println("main start");

		Employee employee1 = new Employee(101, "A", 1000);
		Employee employee2 = new Employee(101, "A", 1000);

		System.out.println("employee one");
		System.out.println(employee1);
		System.out.println("employee one hashcode=" + employee1.hashCode());

		System.out.println();

		System.out.println("employee two");
		System.out.println(employee2);
		System.out.println("employee two hashcode=" + employee2.hashCode());

		System.out.println();

		if (employee1.equals(employee2))
			System.out.println("both employees are same");
		else
			System.out.println("its different");

		System.out.println();

		if (employee1 == employee2)
			System.out.println("both employees are same");
		else
			System.out.println("its different");

		System.out.println("main end");
	}
}
