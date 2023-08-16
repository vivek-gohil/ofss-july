package com.ofss.main.repository;

import java.util.ArrayList;
import java.util.List;

import com.ofss.main.domain.Employee;

public class EmployeeRepository implements EmployeeRepositoryInterface {

	private List<Employee> employeeList = new ArrayList<>();

	public EmployeeRepository() {
		Employee employee1 = new Employee(101, "Anurav", 1000);
		Employee employee2 = new Employee(102, "Ravi", 1000);
		Employee employee3 = new Employee(103, "Bhargava", 1000);
		Employee employee4 = new Employee(104, "Anshu", 1000);
		Employee employee5 = new Employee(105, "Sai", 1000);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);

	}

	@Override
	public boolean addNewEmployee(Employee employee) {
		return employeeList.add(employee);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		for (Employee e : employeeList) {
			if (employee.getEmployeeId() == e.getEmployeeId()) {
				employee.setName(e.getName());
				employee.setSalary(e.getSalary());
				return true;
			}
		}
		return false;
	}

	@Override
	public Employee getEmployee(int employeeId) {
		for (Employee e : employeeList) {
			if (employeeId == e.getEmployeeId()) {
				return e;
			}
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeList;
	}

	@Override
	public boolean removeEmployee(int employeeId) {
		for (Employee e : employeeList) {
			if (employeeId == e.getEmployeeId()) {
				return employeeList.remove(e);
			}
		}
		return false;
	}

}
