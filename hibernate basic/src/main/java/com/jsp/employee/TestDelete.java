package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
	Employee employee=	entityManager.find(Employee.class, 7);
		
		if(employee!=null) {
			entityTransaction.begin();
			entityManager.remove(employee);	//delete id 2 data
			entityTransaction.commit();
			
		}else {
			System.out.println("Not Deleted");
		}
	}

}

