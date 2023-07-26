package com.ofss.domain;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	private static int employeeIdGenerator = 100;

	// default constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// param constructor
	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeIdGenerator;
		this.name = name;
		this.salary = salary;
		employeeIdGenerator++;
	}

	// getter and setter
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
