package jdbc_dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDynamic {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//data from user
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the id");
		int id=scanner.nextInt();
		System.out.println("enter the name");
		String ename=scanner.next();
		System.out.println("enter the salary");
		double salary=scanner.nextDouble();
		
		
		
		//1-load or rigester the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2-establish connectin
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_task2","root","root");
		//3-create statement
		PreparedStatement preparedStatement=connection.prepareStatement("insert into employee values (?,?,?)");
		
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, ename);
		preparedStatement.setDouble(3, salary);
		
		
		//4-4-execute statement
		preparedStatement.execute();
		
		
		connection.close();
		System.out.println("saved succesfully");
				}

}



// output:-
// enter the id
// 1
// enter the name
// Vishal
// enter the salary
// 45000

// enter the id
// 2
// enter the name
// Gullya
// enter the salary
// 75000


// database table:-
// id     ename     salary
// 1      Vishal    45000
// 2      Gullya    75000



