package com.school.controller;

import com.school.service.StudentService;

public class StudentDeleteController {

	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		
		//Delete record in student table by id
		boolean result=studentService.deleteStudentById(1);
		System.out.println(result);
		

	}

}
/*
Output=
true
*/