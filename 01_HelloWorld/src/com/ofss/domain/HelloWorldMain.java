package com.ofss.domain;

import java.util.Scanner;

public class HelloWorldMain {
	public static void main(String[] args) {
		System.out.println("Hello World");

		int employeeId;
		String name;
		double salary;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter EmployeeId");
		employeeId = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();

		System.out.println("Enter Salary");
		salary = scanner.nextDouble();

		System.out.println();
		System.out.println("EmployeeId : " + employeeId);
		System.out.println("Name : " + name);
		System.out.println("Salary :" + salary);

	}
}
