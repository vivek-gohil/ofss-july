package com.ofss.main;

import com.ofss.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new Employee(101, "Vivek", 1000);
		Employee employee2 = new Employee(102, "Ravi", 1000);
		Employee employee3 = new Employee(103, "Bhargava", 1000);

		System.out.println(employee);
		System.out.println(employee2);
		System.out.println(employee3.toString());
		
		System.out.println();
		
		//print all details of each employee
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		
		System.out.println();
		
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee2.getName());
		System.out.println(employee2.getSalary());

		System.out.println();
		
		System.out.println(employee3.getEmployeeId());
		System.out.println(employee3.getName());
		System.out.println(employee3.getSalary());
	}
}
