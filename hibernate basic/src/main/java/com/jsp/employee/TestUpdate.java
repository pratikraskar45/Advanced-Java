package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik"); //persistence name
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee=	entityManager.find(Employee.class,5);
//		employee.setEmail("abc@mail.com");   	//email data to be updated
		employee.setCno(2222222222l);    //cno data to be updated 
		
		entityTransaction.begin();
		entityManager.merge(employee);	//update
		entityTransaction.commit();	
	}

}
