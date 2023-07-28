package com.ofss.main;

import com.ofss.domain.Employee;

public class EmployeeMainV2 {
	public static void main(String[] args) {
		System.out.println("main start");

		// variable of type employee
		Employee employee;
		// employee variable is pointing to new Employee object.
		employee = new Employee(101, "Test", 1000);
		System.out.println(employee);
		System.out.println("employee=" + employee.hashCode()); // 1993134103

		Employee employee2 = new Employee();
		System.out.println(employee2);
		System.out.println("employee2=" + employee2.hashCode()); // 405662939

		employee = employee2;

		System.out.println(employee); // blank values
		System.out.println("employee=" + employee.hashCode()); // 405662939
		System.out.println("employee2=" + employee2.hashCode());// 405662939
		employee.setSalary(500);
		System.out.println(employee.getSalary());
		System.out.println(employee2.getSalary());

		System.out.println("main end");

	}
}
