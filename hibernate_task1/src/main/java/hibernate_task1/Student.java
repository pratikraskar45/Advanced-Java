package hibernate_task1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity   //create database in  MYSQL database // import javax.persistence.Entity;
public class Student {
	
	@Id   //generate id   // import javax.persistence.Id // only id primary key  and not null
	//attribute for student
	private int id;
	private String name;
	private double marks;
	private long phone;
	
	
	
    //generate getters and setters
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	//generate tostring method to override by alt_shift+s
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", phone=" + phone + "]";
	}
	
	
	
	

}
