package com.jsp.employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAll {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");//getConnection
		EntityManager entityManager=entityManagerFactory.createEntityManager();// CRUD
		
		String sql="SELECT e FROM Employee e";
		Query query=	entityManager.createQuery(sql);
		
		List<Employee> employees= query.getResultList();
		for(Employee e: employees) {
			//System.out.println("===========================");
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getEmail());
			System.out.println(e.getCno());
			System.out.println("===========================");
		}	
	}

}

