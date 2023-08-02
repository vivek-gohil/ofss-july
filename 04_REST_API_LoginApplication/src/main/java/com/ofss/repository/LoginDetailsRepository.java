package com.ofss.repository;

import java.util.List;

import com.ofss.domain.LoginDetails;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class LoginDetailsRepository {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("04_REST_API_LoginApplication");
	private EntityManager entityManager;
	private EntityTransaction transaction;

	public List<LoginDetails> getAllLoginDetails() {
		entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		Query query = entityManager.createQuery("SELECT l FROM LoginDetails l");
		List<LoginDetails> loginDetailsList = query.getResultList();
		entityManager.close();
		return loginDetailsList;
	}

	public LoginDetails getLoginDetails(LoginDetails loginDetails) {
		System.out.println(loginDetails);
		entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		try {
			System.out.println("in try");
			TypedQuery<LoginDetails> query = entityManager.createQuery(
					"SELECT l FROM LoginDetails l WHERE l.loginId = ?1 AND l.password = ?2", LoginDetails.class);
			query = query.setParameter(1, loginDetails.getLoginId());
			query = query.setParameter(2, loginDetails.getPassword());
			LoginDetails loginDetailsDB = query.getSingleResult();
			if (loginDetailsDB.getCount() < 3) {
				return updateLoginDetails(loginDetailsDB);
			} else
				return updateCount(loginDetails.getLoginId());
		} catch (NoResultException e) {
			System.out.println("in catch");
			return updateCount(loginDetails.getLoginId());
		} finally {
			if (entityManager.isOpen()) {
				entityManager.close();
			}
		}
	}

	public LoginDetails getSingleLoginDetails(String loginId) {
		entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		LoginDetails loginDetails = entityManager.find(LoginDetails.class, loginId);
		entityManager.close();
		return loginDetails;
	}

	public LoginDetails updateCount(String loginId) {
		System.out.println("in update count");
		entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		LoginDetails loginDetails = entityManager.find(LoginDetails.class, loginId);
		if (loginDetails != null) {
			transaction = entityManager.getTransaction();
			transaction.begin();
			int count = loginDetails.getCount();
			count = count + 1;
			loginDetails.setCount(count);
			if (count >= 3) {
				loginDetails.setStatus(false);
			}
			transaction.commit();
			entityManager.close();
			System.out.println("count updated");
			loginDetails.setName("");
			loginDetails.setPassword("");
			System.out.println(loginDetails);

			return loginDetails;
		} else {
			entityManager.close();
			return null;
		}
	}

	public LoginDetails updateLoginDetails(LoginDetails loginDetails) {
		System.out.println("Reset status and counter ");
		entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		try {
			TypedQuery<LoginDetails> query = entityManager.createQuery(
					"SELECT l FROM LoginDetails l WHERE l.loginId = ?1 AND l.password = ?2", LoginDetails.class);
			query = query.setParameter(1, loginDetails.getLoginId());
			query = query.setParameter(2, loginDetails.getPassword());
			LoginDetails loginDetailsDB = query.getSingleResult();
			if (loginDetailsDB != null) {
				transaction = entityManager.getTransaction();
				transaction.begin();
				loginDetailsDB.setStatus(true);
				loginDetailsDB.setCount(0);
				transaction.commit();
				entityManager.close();
				return loginDetailsDB;
			}
		} catch (NoResultException e) {
			System.out.println(e.getMessage());
		} finally {
			if (entityManager.isOpen())
				entityManager.close();
		}
		return null;

	}

}
