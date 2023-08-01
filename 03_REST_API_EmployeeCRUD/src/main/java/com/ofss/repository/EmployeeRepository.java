package com.ofss.repository;

import java.util.List;

import com.ofss.domain.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class EmployeeRepository {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("02_JPA_EmployeeCRUD");
	private EntityManager entityManager;
	private EntityTransaction transaction;

	public List<Employee> getAllEmployees() {
		entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		Query query = entityManager.createQuery("SELECT e FROM Employee e");
		List<Employee> allEmployees = query.getResultList();
		entityManager.close();
		return allEmployees;
	}

	public Employee getEmployeeByEmployeeId(int employeeId) {
		entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		Employee employee = entityManager.find(Employee.class, employeeId);
		return employee;
	}

	public boolean updateEmployee(Employee employee) {
		entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		Employee employeeDB = entityManager.find(Employee.class, employee.getEmployeeId());
		if (employeeDB != null) {
			transaction = entityManager.getTransaction();
			transaction.begin();
			employeeDB.setName(employee.getName());
			employeeDB.setSalary(employee.getSalary());
			transaction.commit();
			entityManager.close();
			return true;
		}
		return false;
	}

	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		Employee employee = entityManager.find(Employee.class, employeeId);
		if (employee != null) {
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.remove(employee);
			transaction.commit();
			entityManager.close();
			return true;
		}
		return false;
	}

	public boolean addNewEmployee(Employee employee) {
		try {
			entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(employee);
			transaction.commit();
			entityManager.close();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

}
