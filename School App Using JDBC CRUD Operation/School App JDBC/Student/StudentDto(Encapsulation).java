import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	// Dto class
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/java";
		String username="root";
		String password="root";
		String sql="INSERT INTO student VALUES(5,'Tejas','Tejas@gmail.com')";
		
		try {
			//step 1:load/register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2:establish connection 
			Connection connection=DriverManager.getConnection(url, username, password);
			
			//3:create Statement
			Statement statement =connection.createStatement();
			
			//4:execute the statement
			statement.execute(sql);
			
			//5: close connection
			connection.close();
			
			System.out.println("All Good");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
	}
}
/*
Output=
All Good 

//Mysql table created inserted data
id  name    email
1	PRATIK	pratik@mail.com
2	Rohit	rohit@gmail.com
3	Sachin	sachin@gmail.com
4	Rahul	rahul@gmail.com
5	Tejas	Tejas@gmail.com
		
*/