package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("pratik");

		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee=new Employee();
		
		employee.setName("Mayuri");
		employee.setEmail("mayuri@mail.com");
		employee.setCno(2134567890l);
		
		entityTransaction.begin();
		entityManager.persist(employee);	//save data
		entityTransaction.commit();
		
		
		
		
		//extra by mee thinking
		entityManager.clear();
		entityManagerFactory.close();
	}
}
