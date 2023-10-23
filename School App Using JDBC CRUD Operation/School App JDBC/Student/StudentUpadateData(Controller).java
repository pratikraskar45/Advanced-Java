package com.school.controller;

import com.school.service.StudentService;

public class StudentUpdate {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();

		//pass the value to the method which is updated
		int a = studentService.updateStudent(1,"abc@mail.com","abc");
		System.out.println(a);
		
	}

}
/*
 Output= 2 (Updated)
 */