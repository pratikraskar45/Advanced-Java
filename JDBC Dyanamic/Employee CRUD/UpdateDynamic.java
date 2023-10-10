package jdbc_dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDynamic {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	           	//data from user
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the id");
		int id=scanner.nextInt();
		System.out.println("enter the name");
		String ename=scanner.next();
		System.out.println("enter the salary");
		double salary=scanner.nextDouble();
		
		//1-load or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2-establish connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_task2", "root", "root");
		
		
		//3-create statement
		PreparedStatement preparedStatement=connection.prepareStatement("update employee set ename=?,salary=? where id =?");
		preparedStatement.setString(1, ename);   //1 is place holder where data is change
		preparedStatement.setDouble(2, salary);
		preparedStatement.setInt(3, id);
		
		//4-execute satment
		int count= preparedStatement.executeUpdate();  //retrun integer
		
		//5-close connection
		connection.close();
		
		
		System.out.println(count+"rows affected");
				
				
	}

}


// output:-
// enter the id
// 2
// enter the name
// Muddsar
// enter the salary
// 80000



// database table:-
// id     ename      salary
// 1      Vishal     45000
// 2      Muddsar    80000

