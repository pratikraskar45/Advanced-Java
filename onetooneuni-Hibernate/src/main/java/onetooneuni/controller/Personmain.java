package onetooneuni.controller;
import java.util.Scanner;

import onetooneuni.dao.Persondao;
import onetooneuni.dto.Passport;
import onetooneuni.dto.Person;

public class Personmain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Person person=new Person();
		Passport passport=new Passport();
		Persondao persondao=new Persondao();
		
		boolean check=true;
		
		do {
			System.out.println("1.save person \n 2.update person \n 3.delete person \n 4.get person by id"
					+ "\n 5.get all person");
			
			int choice=scanner.nextInt();
			
			switch (choice) {
			
			//case1-for insert the data
			case 1:{
				System.out.println("enter the person id");
				int id=scanner.nextInt();
				System.out.println("enter person name");
				String name=scanner.next();
				System.out.println("enter the person address");
				String address=scanner.next();
				
				person.setId(id);
				person.setName(name);
				person.setAddress(address);
				
				System.out.println("enter the passport id");
				int pid=scanner.nextInt();
				System.out.println("enter the passport name");
				String pname=scanner.next();
				System.out.println("enter passport address");
				String paddress=scanner.next();
				
				passport.setId(pid);
				passport.setName(pname);
				passport.setAddress(paddress);
				
				person.setPassport(passport);
				persondao.saveperson(person);
			}break;
			
			//case2-for update
			case 2:{
				System.out.println("enter the person id");
				int id=scanner.nextInt();
				System.out.println("enter the updating name");
				String name=scanner.next();
				System.out.println("enter the updating address");
				String address=scanner.next();
				
				person.setId(id);
				person.setName(name);
				person.setAddress(address);
				
				persondao.updateperson(id,person);
			}break;
			
			//case3-for delete
			case 3:{
				System.out.println("enter the id");
				int id=scanner.nextInt();
				
				persondao.deleteperson(id);
			}break;
			
			//case4-for get details by id
			case 4:{
				System.out.println("enter the id");
				int id=scanner.nextInt();
				
				persondao.getpersonbyid(id);
			}break;
			
			//case5-for get all the details 
			case 5:{
				persondao.getallperson();
			}break;


			default:
				break;
			}
		} while (check);
	
	}
}


