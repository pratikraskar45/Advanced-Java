package batchexecution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		

		//1-load or register the driver(string class name) 
		Class.forName("com.mysql.cj.jdbc.Driver");   // string class name or throws ClassNotFoundException 
		
		
	  //2-establish connection (java.sql package import)
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/batchexecution_jdbc", "root", "root");   //java.sql package import or throws SQLException 
		
	
		//create object for student1
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Pratik");
		s1.setMarks(80);
		
		//create object for student2
		Student s2=new Student();
		s2.setId(2);
		s2.setName("Jeevan");
		s2.setMarks(85);
		
		//create object for student3
		Student s3=new Student();
		s3.setId(3);
		s3.setName("Vishal");
		s3.setMarks(74);
		
		//add everything at a time we are use list
		List<Student> list=new ArrayList<Student>();//list add from java.unitl package
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		
		
		//3-create statement
		PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?)");
		for(Student student:list) { //java.util.Iterator;
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setDouble(3, student.getMarks());
			preparedStatement.addBatch();   ////add batch() means inserted everything single time 
			
		}
		
    	//4-execute statement 
		preparedStatement.executeBatch();
		
	 	//5-close connection
		connection.close();
		
		System.out.println("inserted");
		
	}
	

}
