package hibernate_task1;

import java.util.Scanner;

public class Studentmain {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		Student student=new Student();//getting from student class
		Studentcrud studentcrud=new Studentcrud();//getting from student class studentcrud
		
		boolean check=true;
		do {
			System.out.println("1.save student /n 2.update student /n 3.delete student /n 4.get student by id /n" + "5.get all students");
			int choice =scanner.nextInt();
			switch (choice) {
			
			//case-1 for save the data
			case 1:{   
				System.out.println("enter the id");
				int id =scanner.nextInt();
				System.out.println("enter the name");
				String name=scanner.next();
				System.out.println("enter the marks");
				double marks=scanner.nextDouble();
				System.out.println("enter the phone");
				long phone =scanner.nextLong();
				
				student.setId(id);
				student.setName(name);
				student.setMarks(marks);
				student.setPhone(phone);
				
				studentcrud.savestudent(student);
				
			}break;
			
			//case-2 for updating
			case 2:{
				System.out.println("enter the id");
				int id =scanner.nextInt();
				System.out.println("enter the updating name");
				String name=scanner.next();
				System.out.println("enter the updating  marks");
				double marks=scanner.nextDouble();
				System.out.println("enter the updating  phone");
				long phone =scanner.nextLong();
				
				student.setId(id);
				student.setName(name);
				student.setMarks(marks);
				student.setPhone(phone);
				
				studentcrud.updatestudent(id, name, marks, phone);
				}break;
				
			//case-3 for delete by id 
			case 3:{ 
				System.out.println("enter the id");
				int id =scanner.nextInt();
				
				student.setId(id);
				studentcrud.deletestudent(id);	
			}break;
			
			//case-4 for find or get by id 
			case 4:{
				System.out.println("enter the id");
				int id =scanner.nextInt();
				
				student.setId(id);
			    studentcrud.getstudentid(id);
			}break;
			
			//case-5 for get all by JPQl-java persistence query language 
			case 5:{
				
				studentcrud.getallstudent();
				
			}break;
			

			default:
				break;
			}
		} while (check);
		
		
		
		
	}

}
