package jdbc_dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectDyanamic {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//data from user
				Scanner scanner= new Scanner(System.in);
				System.out.println("enter the id");
				int id=scanner.nextInt();
		
		//1-load or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2-establish connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_task2", "root", "root");
		
		//3-create statment
        PreparedStatement preparedStatement=connection.prepareStatement("Select * from employee where id=? ");
        
        preparedStatement.setInt(1, id);
		
		
		//4-execute statment 
		ResultSet resultset=  preparedStatement.executeQuery();  //retrun type is resultset
		
		while(resultset.next()) {  //next method because data present or not
			System.out.println(resultset.getInt(1)+" "+ resultset.getString(2)+" "+ resultset.getLong(3) ); //bcz id in  int datatype  to op show in eclipse
            //System.out.println(resultset.getString(2) );
			//System.out.println(resultset.getLong(3) );
		}
		//5-close connection
		connection.close();
	
	}

}

// output:-


// enter the id
// 1


// database table:-
// id     ename     salary
// 1      Vishal    45000

