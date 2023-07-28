package com.ofss.domain;

import java.util.Objects;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;

	// default constructor
	public Employee() {
		System.out.println("default constrcutor of Employee");
	}

	// param constructor
	public Employee(int employeeId, String name, double salary) {

		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		System.out.println("param. constructor of Employee");
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
	
	

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}

}
