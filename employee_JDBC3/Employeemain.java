package employee_jdbc3;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Employeemain {
	public static void main(String[] args) {
		//user input 
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the id");
		int id=scanner.nextInt();
		System.out.println("enter the name");
		String ename=scanner.next();
		System.out.println("enter the salary");
		double salary=scanner.nextDouble();
		
		//for set  id bye create the object
		Employee employee=new Employee();
		employee.setId(id);
		employee.setName(ename);
		employee.setSalary(salary);
		
		
		//call the  Employeecrud class in main class
		
		Employeecrud employeecrud=new Employeecrud();
		try {
			employeecrud.saveEmployee(employee);  //throws try and catch batch
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

// //output:-
// enter the id
// 1
// enter the name
// Jeevan
// enter the salary
// 69000
//inserted
// //

