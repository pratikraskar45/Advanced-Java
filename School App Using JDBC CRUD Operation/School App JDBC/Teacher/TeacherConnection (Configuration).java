package com.school.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TeacherConfiguration { // TeacherConnectionClass 
	String url="jdbc:mysql://localhost:3306/school";
	String username="root";
	String password="root";
	Connection connection=null;
	
	//to establish Connection
	public Connection getConnection() { // Connection is a Interface
		try {
			//step 1:load/register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2:establish connection 
			connection=	DriverManager.getConnection(url, username, password);  // DriverManager is a class
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return connection;
	}

}
