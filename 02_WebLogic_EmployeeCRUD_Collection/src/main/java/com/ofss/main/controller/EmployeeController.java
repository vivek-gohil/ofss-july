package com.ofss.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.main.domain.Employee;
import com.ofss.main.service.EmployeeService;
import com.ofss.main.service.EmployeeServiceInterface;

@RestController
@RequestMapping("employeecrudapi")
public class EmployeeController {

	private EmployeeServiceInterface employeeServiceInterface = new EmployeeService();

	@RequestMapping(value = "employees", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		return employeeServiceInterface.getAllEmployees();
	}

	@RequestMapping(value = "employees", method = RequestMethod.POST)
	public boolean addEmployee(@RequestBody Employee employee) {
		return employeeServiceInterface.addNewEmployee(employee);
	}
}
