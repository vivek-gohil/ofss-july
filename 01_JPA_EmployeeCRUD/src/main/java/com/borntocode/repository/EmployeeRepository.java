package com.borntocode.repository;

import java.util.List;

import com.borntocode.domain.Employee;
import com.borntocode.util.EmployeeEntityManagerFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class EmployeeRepository {
	private EntityManager entityManager;
	private EntityTransaction transaction;

	public void addNewEmployee(Employee employee) {
		entityManager = EmployeeEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();
		entityManager.close();
	}

	public Employee getEmployeeByEmployeeId(int employeeId) {
		entityManager = EmployeeEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		Employee employee = entityManager.find(Employee.class, employeeId);
		entityManager.close();
		return employee;
	}

	public List<Employee> getAllEmployees() {
		entityManager = EmployeeEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		Query query = entityManager.createQuery("SELECT e FROM Employee e");
		List<Employee> allEmployees = query.getResultList();
		entityManager.close();
		return allEmployees;
	}

	public boolean updateEmployeeDetails(Employee employee) {
		entityManager = EmployeeEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		Employee employeeTemp = entityManager.find(Employee.class, employee.getEmployeeId());
		System.out.println("Employee From Main");
		System.out.println(employee);
		System.out.println("Employee From Database");
		System.out.println(employeeTemp);
		if (employeeTemp != null) {
			transaction = entityManager.getTransaction();
			transaction.begin();
			employeeTemp.setName(employee.getName());
			employeeTemp.setSalary(employee.getSalary());
			transaction.commit();
			entityManager.close();
			return true;
		} else {
			entityManager.close();
			return false;
		}
	}

	public boolean deleteEmployee(int employeeId) {
		entityManager = EmployeeEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		transaction = entityManager.getTransaction();

		Employee employeeTemp = entityManager.find(Employee.class, employeeId);
		if (employeeTemp != null) {
			transaction.begin();
			entityManager.remove(employeeTemp);
			transaction.commit();
			entityManager.close();
			return true;
		} else {
			entityManager.close();
			return false;
		}

	}

}
