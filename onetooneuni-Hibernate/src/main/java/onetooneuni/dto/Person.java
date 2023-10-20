package onetooneuni.dto; //dto-data transfer object

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity   //create the database 
public class Person {
	
	@Id  ////generate id as a primary key
	
	//attribute for person
	private int id;
	private String name;
	private String address;
	
	
	
	@OneToOne  //build the relation between person and passport two tables and passport as a forgin key
	private Passport passport;//import data from passport class as a forgin key

     
	//generate getters and setters for all attribute  
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Passport getPassport() {
		return passport;
	}


	public void setPassport(Passport passport) {
		this.passport = passport;
	}


	//generate tostring method to override by alt_shift+s
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", passport=" + passport + "]";
	}
	
	
	

}
