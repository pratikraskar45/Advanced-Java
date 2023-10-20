package onetooneuni.dao;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import onetooneuni.dto.Passport;
import onetooneuni.dto.Person;

public class Persondao { //dao-data access object
	//for database build
	public EntityManager getEntityManager() {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
		
		//to perform CRUD operation
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
		
	
	}
	//1-create or insert the data
	public void saveperson(Person person) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Passport passport=person.getPassport();
	
	
	entityTransaction.begin();
	entityManager.persist(passport);
	entityManager.persist(person);
	entityTransaction.commit();
	
	}
	//2-update person
	  public void updateperson(int id,Person person) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person dbPerson=entityManager.find(Person.class, id);
		
		if (dbPerson!=null) {
			person.setId(id);
			person.setPassport(dbPerson.getPassport()); //only when update the passport 
		}
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();
		
	}
	//3-Delete passport and person
	public void deleteperson(int id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=  entityManager.find(Person.class, id);
		Passport passport= person.getPassport();
		
		entityTransaction.begin();
		entityManager.remove(passport);
		entityManager.remove(person);
		entityTransaction.commit();
		
	}
	//4-get id or find
	public void getpersonbyid(int id ) {
		EntityManager entityManager=getEntityManager();
		Person person= entityManager.find(Person.class, id);
		System.out.println(person);
		
		
	}
	 //5-get all details by  to JPQl-java persistence query language 
		public void getallperson() {
			
			EntityManager entityManager=getEntityManager();      //import javax.persistence.EntityManager;
			Query query=entityManager.createQuery("select p from Person p");//Query import from import javax.persistence.Query;
//			List<Person> list=query.getResultList();//list import form java.until
			System.out.println(query.getResultList());
			
	
			
		}
	
	
}
