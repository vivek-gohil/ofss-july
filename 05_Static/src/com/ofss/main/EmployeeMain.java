package com.ofss.main;

import com.ofss.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new Employee(0, "A", 1000);
		Employee employee2 = new Employee(0, "B", 1000);
		Employee employee3 = new Employee(0, "C", 1000);

		System.out.println(employee.getEmployeeId()); // 100
		System.out.println(employee2.getEmployeeId()); // 101
		System.out.println(employee3.getEmployeeId()); // 102
		
		Employee employee4 = new Employee(0, "D", 1000);
		System.out.println(employee4.getEmployeeId()); // 103
		
	}
}
