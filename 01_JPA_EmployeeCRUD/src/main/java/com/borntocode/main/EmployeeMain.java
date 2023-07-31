package com.borntocode.main;

import java.util.Scanner;

import com.borntocode.domain.Employee;
import com.borntocode.repository.EmployeeRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeMain {
	public static void main(String[] args) {

		EmployeeRepository employeeRepository = new EmployeeRepository();
		Scanner scanner = new Scanner(System.in);
		Employee employee = null;
		int employeeId;
		String name;
		double salary;
		int choice;
		boolean result = false;

		System.out.println("main start");
		System.out.println("Employee CRUD Application");
		do {
			System.out.println();
			System.out.println("1. Add New Employee");
			System.out.println("2. Update Existing Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Select Single Employee");
			System.out.println("5. Get All Employees");
			System.out.println("6. Exit");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter EmployeeId");
				employeeId = scanner.nextInt();
				System.out.println("Enter Name");
				name = scanner.next();
				System.out.println("Enter Salary");
				salary = scanner.nextDouble();
				employee = new Employee(employeeId, name, salary);
				employeeRepository.addNewEmployee(employee);
				System.out.println("Employee Added Successfully");
				break;
			case 2:
				System.out.println("Enter EmployeeId");
				employeeId = scanner.nextInt();
				System.out.println("Enter New Name");
				name = scanner.next();
				System.out.println("Enter New Salary");
				salary = scanner.nextDouble();
				employee = new Employee(employeeId, name, salary);
				result = employeeRepository.updateEmployeeDetails(employee);
				if (result)
					System.out.println("Employee Updated Successfully");
				else
					System.out.println("Failed To Update Employee Successfully");
				break;

			case 3:
				System.out.println("Enter EmployeeId");
				employeeId = scanner.nextInt();
				result = employeeRepository.deleteEmployee(employeeId);
				if (result)
					System.out.println("Employee Deleted Successfully");
				else
					System.out.println("Failed To Delete Employee Successfully");
				break;
			case 4:
				System.out.println("Enter EmployeeId");
				employeeId = scanner.nextInt();
				employee = employeeRepository.getEmployeeByEmployeeId(employeeId);
				if (employee != null)
					System.out.println(employee);
				else
					System.out.println(employee);
				break;
			case 5:
				for (Employee e : employeeRepository.getAllEmployees()) {
					System.out.println(e);
				}
				break;
			case 6:
				System.out.println("Thank You");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		} while (true);

	}
}
