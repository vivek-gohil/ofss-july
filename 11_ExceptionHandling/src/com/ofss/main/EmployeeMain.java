package com.ofss.main;

import com.ofss.domain.Employee;
import com.ofss.exception.InvalidEmployeeSalaryException;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = null;

		try {
			employee = new Employee(101, "Test", 200);
		} catch (InvalidEmployeeSalaryException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(employee);
	}
}
