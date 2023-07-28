package com.ofss.main;

import com.ofss.domain.Employee;

public class EmployeeArrayMain {
	public static void main(String[] args) {
		long[] contactNumber = new long[] { 12345, 1235 };
		Employee employee = new Employee(101, "Vivek", 1000, contactNumber);
		System.out.println(employee);

		Employee employee2 = new Employee(102, "Test", 1000, new long[] {});
		System.out.println(employee2);

		Employee employee3 = new Employee(103, "Test", 1000, new long[] { 123456 });
		System.out.println(employee3);

//		Employee[] employees = new Employee[5];

//		// create 5 objects of employee class
//		Employee employee1 = new Employee(101, "A", 1000);
//		Employee employee2 = new Employee(102, "B", 1000);
//		Employee employee3 = new Employee(103, "C", 1000);
//		Employee employee4 = new Employee(104, "D", 1000);
//		Employee employee5 = new Employee(105, "E", 1000);
//
//		// store in employees array
//		employees[0] = employee1;
//		employees[1] = employee2;
//		employees[2] = employee3;
//		employees[3] = employee4;
//		employees[4] = employee5;
//
//		// print all elements of array
//		for (Employee e : employees) {
//			System.out.println(e);
//		}
	}
}
