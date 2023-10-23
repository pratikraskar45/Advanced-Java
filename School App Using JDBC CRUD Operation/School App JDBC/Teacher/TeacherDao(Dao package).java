package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.school.configuration.TeacherConfiguration;
import com.school.dto.TeacherDto;

public class TeacherDao {
	TeacherConfiguration teacherConfiguration = new TeacherConfiguration();
	Connection connection = null;

	// get all Record of Teacher table
	public TeacherDto selectAllDataById(TeacherDto teacherDto) {
		connection = teacherConfiguration.getConnection();
		
		// ? is called as a delimiter / placeholder
		String sql = "SELECT * FROM teacher";

		try {
			//It taking input from the user dynamically
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			//Execute statement
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				//for fetching /getting data by its coulumn number
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("============================================");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				//connection close
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return teacherDto;

	}

//=====================================//================================//===================================	
	// update teacher data
	public int updateTeacherEmailById(int id, String email, String name) {
		connection = teacherConfiguration.getConnection();

		// ? is called as a delimiter / placeholder
		String sql = "UPDATE teacher SET email=?, name=? WHERE id=?";
		int a = 0;

		try {
			//It taking input from the user dynamically
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// passed the values to the delimiter/ placeholder
			preparedStatement.setString(1, email);	// 1st ? in query
			preparedStatement.setString(2, name);	//2nd ? in query
			preparedStatement.setInt(3, id);	//3rd ? in query

			//Execute Statement
			a = preparedStatement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				//Execute Statement
				connection.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (a > 0) {
			return a;	//printing updated data
		} else {
			return -1;
		}

	}

	
//=====================================//================================//===================================
	// TO Delete Teacher Data
	public boolean deleteTeacherById(int id) {
		connection = teacherConfiguration.getConnection();

		// Delete Query
		String sql = "DELETE FROM teacher WHERE id=?";
		int i = 0;
		try {
			// It taking input from the user dynamically
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			i = preparedStatement.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				// close connection
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}
	}

	
//=====================================//================================//===================================	
	// insert data in teacher data
	// To Save Teacher Data so method created
	public TeacherDto savedTeacher(TeacherDto teacherDto) {
		// ? is called as a delimiter / placeholder
		String sql = "INSERT INTO teacher VALUES(?,?,?)";
		connection = teacherConfiguration.getConnection();

		try {
			// create statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// passed the values to the delimiter/ placeholder
			preparedStatement.setInt(1, teacherDto.getId());
			preparedStatement.setString(2, teacherDto.getName());
			preparedStatement.setString(3, teacherDto.getEmail());

			// Execute Statement
			preparedStatement.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				//connection close
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return teacherDto;

	}

}
