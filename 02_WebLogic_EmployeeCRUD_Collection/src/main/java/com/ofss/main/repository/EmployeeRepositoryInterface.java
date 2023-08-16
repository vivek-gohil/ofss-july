package com.ofss.main.repository;

import java.util.List;

import com.ofss.main.domain.Employee;

public interface EmployeeRepositoryInterface {
	public boolean addNewEmployee(Employee employee);

	public boolean updateEmployee(Employee employee);

	public Employee getEmployee(int employeeId);

	public List<Employee> getAllEmployees();

	public boolean removeEmployee(int employeeId);
}
