package employee_jdbc3;

public class Employee {
	//attribute names are private
	private int id;
	private String name;
	private double salary;
	
	//getter and setters for all id,name,salary
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
