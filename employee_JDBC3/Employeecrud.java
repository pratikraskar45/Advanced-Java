package employee_jdbc3;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Employeecrud {
	
	public Connection getConnection() throws SQLException, IOException { //import as a connection
		
		
		//1-load or register for Driver 
		Driver driver=new Driver();
		DriverManager.registerDriver(driver); //driver manager import & throws sql execption 
		
		
		//2-establish connection
		FileInputStream fileInputStream=new FileInputStream("config.properties");//file input the project import java.io.FileInputStream
		
		Properties properties=new Properties(); //java.util.Properties;
		
		properties.load(fileInputStream); // throws IOexception //import file input stream
		
		Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("password"));
		
		return connection;
			
			
		}
	
	//Crud operation I-create/insert
	public Employee saveEmployee(Employee employee) throws SQLException, IOException {
		
		Connection connection= getConnection();  //throws sqlexception,IOexception
		//3-execute statment
		PreparedStatement preparedStatement=connection.prepareStatement("insert into employee values(?,?,?)");
		preparedStatement.setInt(1, employee.getId());
		preparedStatement.setString(2, employee.getName());
		preparedStatement.setDouble(3, employee.getSalary());
		//4-execute statement
		preparedStatement.execute();
		//5-close connection
		connection.close();
		
		System.out.println("Inserted");
		return employee;
	}
		
		}

