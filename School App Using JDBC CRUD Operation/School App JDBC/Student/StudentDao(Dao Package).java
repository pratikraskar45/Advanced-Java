package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.school.configuration.StudentHelperClass;
import com.school.dto.Student;

public class StudentDao {
	StudentHelperClass studenthelperClass=new StudentHelperClass();
	Connection connection=null;
	int i=0;
	
	//to get all record of student table
	public Student selectAll(Student student) {
		connection=	studenthelperClass.getConnection();
		
		// ? is called as a delimiter / placeholder
		String sql="SELECT * FROM student";
		try {
			//It taking input from the user dynamically
			PreparedStatement preparedStatement=	connection.prepareStatement(sql);
			
			//Execute statement
			ResultSet resultSet=	preparedStatement.executeQuery(sql);
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("=====================================");
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				//connection close
				connection.close();
				System.out.println("All Good");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return student;
	}
	
//=====================================//================================//===================================
	//to update student record
	public int updateStudent(int id, String name,String email) 
	{
		connection=studenthelperClass.getConnection();
		
		// ? is called as a delimiter / placeholder
		String sql="UPDATE student SET name=? ,email=? WHERE id=?";
		int a=0;
		
		
		try {
			//It taking input from the user dynamically
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			
			// passed the values to the delimiter/ placeholder
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			preparedStatement.setInt(3, id);
			
			//Execute Statement
			a=	preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				//Connection close
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		if(a>0) {
		return a;	
		}else {
			return -1;
		}
	}
	
	
//=====================================//================================//===================================	
	//TO delete Student Data
	public boolean deleteStudentById(int id) {
		connection=	studenthelperClass.getConnection();
		
		//Delete Query
		String sql="DELETE FROM student WHERE id=?";
		
		try {
			//It taking input from the user dynamically
		PreparedStatement preparedStatement= connection.prepareStatement(sql);
		
		preparedStatement.setInt(1,id);
		
		i=preparedStatement.executeUpdate();		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				//close connection
				connection.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
		if(i>0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
//=====================================//================================//===================================	
	
	// To Save Student Data so method created
	public Student saveStudent(Student student) {
		connection=studenthelperClass.getConnection();
		
		//? is called as a delimiter / placeholder
		String sql="INSERT INTO student VALUES(?,?,?)";
		
		 
		try {
			//create statement
			PreparedStatement	preparedStatement = connection.prepareStatement(sql);
			
			// passed the values to the delimiter/ placeholder
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2,student.getName());
			preparedStatement.setString(3,student.getEmail());
			
			//Execute Statement
			preparedStatement.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				//connection close
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return student;
	}

}
