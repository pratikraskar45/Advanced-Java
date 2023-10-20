package onetooneuni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity   //create database in  MYSQL database // import javax.persistence.Entity;

public class Passport {
	
	@Id    //generate id as a primary key   // import javax.persistence.Id 
	
	//attribute for a passport
	private int id;
	private String name;
	private String address;
	
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
	//generate tostring method to override by alt_shift+s
	@Override
	public String toString() {
		return "Passport [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	

}
