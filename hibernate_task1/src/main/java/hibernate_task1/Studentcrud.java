package hibernate_task1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Studentcrud {
	     //database build
	public EntityManager getEntityManager() {  //import javax.persistence.EntityManager;
		
			
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");   //import javax.persistence.EntityManagerFactory;
			                                   // persistence import from javax.persistence.Persistence;
			//to perform CRUD operation
			EntityManager entityManager=entityManagerFactory.createEntityManager();   //import javax.persistence.EntityManager;
			return entityManager ;
		}
	
	//1-for a save or insert the data
	public void savestudent(Student student) {
		
		EntityManager entityManager=getEntityManager();  //import javax.persistence.EntityManager;
		
		//its used the transfer the data to database
		EntityTransaction entityTransaction=entityManager.getTransaction();  //import javax.persistence.EntityTransaction;
		
		student.setId(student.getId());
		student.setName(student.getName());
		student.setPhone(student.getPhone());
		student.setMarks(student.getMarks());
		
		//start the process to stored the data
		entityTransaction.begin();
		
		//persist is for saving or we make use of persist,merge,remove,find method by entitymanager itself
		entityManager.persist(student);  //for save or insert
		
		//save and end the process
		entityTransaction.commit();
		
	}
	
	//2-for a update 
	public void updatestudent(int id,String name,double marks,long phone) {
		
		EntityManager entityManager= getEntityManager();  //import javax.persistence.EntityManager;
		
		EntityTransaction entityTransaction=entityManager.getTransaction();   //import javax.persistence.EntityTransaction;
		
		 Student student= entityManager.find(Student.class,id);
		 student.setName(name);
		 student.setMarks(marks);
		 student.setPhone(phone);
		 
		 
		 entityTransaction.begin();
		 entityManager.merge(student); //for updating
		 entityTransaction.commit();
		 
			
	}
	//3-for delete
	 public void deletestudent(int id) {
		 EntityManager entityManager=getEntityManager();   //import javax.persistence.EntityManager;
		 EntityTransaction entityTransaction=entityManager.getTransaction();   //import javax.persistence.EntityTransaction;
		 
		 Student student=entityManager.find(Student.class, id);
		 
		 entityTransaction.begin();
		 entityManager.remove(student); //for delete
		 entityTransaction.commit();
		 
		
	}
	 
	 //4-for a find or select operation
	 public void getstudentid(int id) {
		 EntityManager entityManager=getEntityManager();    //import javax.persistence.EntityManager;
		 Student student=   entityManager.find(Student.class, id);
		 System.out.println(student);
		
	}
	 //get all details by  to JPQl-java persistence query language 
	public void getallstudent() {
		
		EntityManager entityManager=getEntityManager();      //import javax.persistence.EntityManager;
		Query query=entityManager.createQuery("select s from Student s");//Query import from import javax.persistence.Query;
		List<Student> list=query.getResultList();//list import form java.until
		System.out.println(list);
		

		
		
	}
		
	}


