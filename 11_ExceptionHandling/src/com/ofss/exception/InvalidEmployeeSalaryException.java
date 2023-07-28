package com.ofss.exception;

//Unchecked Exception
public class InvalidEmployeeSalaryException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Invalid Employee Salary , Enter Salary > 0 ";
	}
}
