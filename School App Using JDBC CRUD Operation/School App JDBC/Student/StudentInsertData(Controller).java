package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		Student student=new Student();
		// pass the values to the  Student means Dto package class (Encapsulation)
		student.setId(1);
		student.setName("xyz");
		student.setEmail("xyz@mail.com");
		
		StudentService studentService= new StudentService();
		
		
		Student s=	studentService.saveStudent(student);
		if(s!=null) {
			System.out.println(s.getId() + " Saved Successfully");
		}
	}

}
/*
Output=
1 Saved Successfully

mysql student table data insert
id  name     email
1	xyz		 xyz@mail.com

*/