package com.ofss.main.service;

import java.util.List;

import com.ofss.main.domain.Employee;
import com.ofss.main.repository.EmployeeRepository;
import com.ofss.main.repository.EmployeeRepositoryInterface;

public class EmployeeService implements EmployeeServiceInterface {
	private EmployeeRepositoryInterface employeeRepositoryInterface = new EmployeeRepository();

	@Override
	public boolean addNewEmployee(Employee employee) {
		return employeeRepositoryInterface.addNewEmployee(employee);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		return employeeRepositoryInterface.updateEmployee(employee);
	}

	@Override
	public Employee getEmployee(int employeeId) {
		return employeeRepositoryInterface.getEmployee(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepositoryInterface.getAllEmployees();
	}

	@Override
	public boolean removeEmployee(int employeeId) {
		return employeeRepositoryInterface.removeEmployee(employeeId);
	}

	
}
