package com.product.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProductConfiguration {
	String url = "jdbc:mysql://localhost:3306/product_jdbc";
	String username = "root";
	String password = "root";
	Connection connection = null;

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return connection;
	}

}
