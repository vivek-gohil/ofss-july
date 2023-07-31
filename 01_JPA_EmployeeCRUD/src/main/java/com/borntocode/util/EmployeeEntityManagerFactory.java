package com.borntocode.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmployeeEntityManagerFactory {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY;

	static {
		ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("01_JPA_EmployeeCRUD");
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		return ENTITY_MANAGER_FACTORY;
	}

	public static void closeEntityManagerFactory() {
		ENTITY_MANAGER_FACTORY.close();
	}
}
