package jdbc_basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSave {
public static void main(String[] args) {
	
	String url="jdbc:mysql://localhost:3306/java";
	String username="root";
	String password="root";
	String sql="INSERT INTO student VALUES(7,'Tushar','tushar@mail.com') ";
	
	//step 1:load/register the driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2:establish connection 
		Connection connection=DriverManager.getConnection(url, username, password);
		
		//3:establish connection
		Statement statement= connection.createStatement();
		
		//4:execute the statement
		statement.execute(sql);
		
		//5: close connection
		connection.close();
		
		System.out.println("all  good");

	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}


