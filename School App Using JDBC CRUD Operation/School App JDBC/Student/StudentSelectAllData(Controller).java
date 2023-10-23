package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentGetAll {
	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		
		//local declaration of Student class(Dto package class (Encapsulation))
		Student student = null;
		Student s=	studentService.selectAll(student);
		if(s!=null) {
		System.out.println(s);
		}
		
	}

}
/*
Output=
1
tushar
tushar@mail.com
=====================================
2
xyz
xyz@mail.com
=====================================
All Good

*/