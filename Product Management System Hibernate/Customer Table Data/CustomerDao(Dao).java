package com.productDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.product.Dto.CustomerDto;
import com.product.configuration.ProductConfiguration;

public class CustomerDao {
	ProductConfiguration productConfiguration = new ProductConfiguration();
	Connection connection = null;

	
	
	// to get one record of customer table
	public void selectOneDataById(int id) {
		connection = productConfiguration.getConnection();
		String sql = "SELECT * FROM customer WHERE id=?";

		try {
			// ? is called as a delimiter / placeholder
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			//pass value
			preparedStatement.setInt(1, id);

			// It taking input from the user dynamically
			// execute statement
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("=========================================================");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				// connection close
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		
	}


//=====================================//================================//===================================
	
	
	// to get all record of customer table
	public CustomerDto selectAllDataById(CustomerDto customerDto) {
		connection = productConfiguration.getConnection();
		String sql = "SELECT * FROM customer";

		try {
			// ? is called as a delimiter / placeholder
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// It taking input from the user dynamically
			// execute statement
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("=========================================================");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				// connection close
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return customerDto;
	}

//=====================================//================================//===================================

	// to update customer record
	public int updateCustomer(int id, String name, String email) {
		connection = productConfiguration.getConnection();

		// ? is called as a delimiter / placeholder
		String sql = "UPDATE customer SET name=?, email=? WHERE id=?";
		int a = 0;

		try {
			// It taking input from the user dynamically
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// passed the values to the delimiter/ placeholder
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			preparedStatement.setInt(3, id);

			// Execute Statement
			a = preparedStatement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				// Close connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (a > 0) {
			return a;
		} else {
			return -1;
		}

	}

//=====================================//================================//===================================	

	// TO delete Customer Data

	public boolean deleteCustomerById(int id) {
		connection = productConfiguration.getConnection();

		// Delete Query
		String sql = "DELETE FROM customer WHERE id=?";
		int i = 0;

		try {
			// It taking input from the user dynamically
			PreparedStatement preparedStatemnet = connection.prepareStatement(sql);

			preparedStatemnet.setInt(1, id);

			// execute statement
			i = preparedStatemnet.executeUpdate();

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

	// To Save Product Data so method created
	public CustomerDto saveCustomer(CustomerDto customerDto) {
		// ? is called as a delimiter / placeholder
		String sql = "INSERT INTO customer VALUES(?,?,?)";
		connection = productConfiguration.getConnection();

		try {
			// create statement
			PreparedStatement preparedstatement = connection.prepareStatement(sql);

			// passed the values to the delimiter/ placeholder
			preparedstatement.setInt(1, customerDto.getId());
			preparedstatement.setString(2, customerDto.getName());
			preparedstatement.setString(3, customerDto.getEmail());

			// Execute Statement
			preparedstatement.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				// connection close
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return customerDto;
	}

}
