package jdbc_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

		public static void main(String[] args) {
			String url="jdbc:mysql://localhost:3306/java";
			String username="root";
			String password="root";
			Connection connection=null;
			
			
			//step 1:load/register the driver
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//2:establish connection 
				 connection=DriverManager.getConnection(url, username, password);
				
				//3:establish connection
				Statement statement= connection.createStatement();
				
				//4:execute the statement
				
				
				//for insert data in table
//	         	statement.execute("INSERT INTO emp VALUES(2,'Vishal','vishal@mail.com') ");
				
				
				//for delete data from table
//				statement.execute("DELETE FROM emp WHERE id=46");
		

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
					System.out.println("all good");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("not good");
				}
			}
			
		}

	}

