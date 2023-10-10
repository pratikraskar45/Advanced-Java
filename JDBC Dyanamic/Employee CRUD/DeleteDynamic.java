package jdbc_dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDynamic {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//data from user
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the id");
		int id=scanner.nextInt();
	    
				
			
				//1-load or rigester the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//2-establish connectin
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_task2","root","root");
				//3-create statement
				PreparedStatement preparedStatement=connection.prepareStatement("delete from employee where id=?");
				
				preparedStatement.setInt(1, id);
				
				
				
				//4-execute statement
				preparedStatement.execute();
				
				
				connection.close();
				System.out.println("Deleted");
	}

}





// output:-


// enter the id
// 2


// database table:-
// id     ename     salary
// 1      Vishal    45000

