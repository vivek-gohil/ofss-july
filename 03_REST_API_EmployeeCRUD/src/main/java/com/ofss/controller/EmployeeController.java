package com.ofss.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.domain.Employee;
import com.ofss.repository.EmployeeRepository;

//http://localhost:8080/employeeapi
@RestController
@RequestMapping("employeeapi")
public class EmployeeController {

	private EmployeeRepository employeeRepository = new EmployeeRepository();
	
	//update
	@RequestMapping(value="employees" , method = RequestMethod.PUT)
	public boolean updateEmployee(@RequestBody Employee employee) {
		return employeeRepository.updateEmployee(employee);
	}
	
	//delete
	@RequestMapping(value = "employees/{employeeId}", method = RequestMethod.DELETE)
	public boolean deleteEmployee(@PathVariable int employeeId) {
		return employeeRepository.deleteEmployeeByEmployeeId(employeeId);
	}

	// http://localhost:8080/employeeapi/employees/{employeeId}
	@RequestMapping(value = "employees/{employeeId}", method = RequestMethod.GET)
	public Employee getSingleEmployee(@PathVariable int employeeId) {
		return employeeRepository.getEmployeeByEmployeeId(employeeId);
	}

	// http://localhost:8080/employeeapi/employees
	@RequestMapping(value = "employees", method = RequestMethod.GET)
	public List<Employee> allEmployees() {
		return employeeRepository.getAllEmployees();
	}

	// http://localhost:8080/employeeapi/employees
	@RequestMapping(value = "employees", method = RequestMethod.POST)
	public boolean addEmployee(@RequestBody Employee employee) {
		return employeeRepository.addNewEmployee(employee);
	}
}
