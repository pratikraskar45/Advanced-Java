package com.school.controller;

import com.school.dto.TeacherDto;
import com.school.service.TeacherService;

public class TeacherController {
	public static void main(String[] args) {
		TeacherDto teacherDto=new TeacherDto();
		// pass the values to the  TeacherDto means Dto package class(Encapsulation)
		teacherDto.setId(3);
		teacherDto.setName("Dhawan");
		teacherDto.setEmail("dhawan@mail.com");
		
		TeacherService teacherService=new TeacherService();
		TeacherDto t= teacherService.savedTeacher(teacherDto);
		if(t!=null) {
			
		System.out.println(t.getId() + " Saved Successfully");	
		}
		
	}
}
/*
Output=
3 Saved Successfully

mysql teacher data insert

id  name     email
1	Rohit	rohit@mail.com
2	Rahul	rahul@mail.com
3	Dhawan	dhawan@mail.com
		
*/