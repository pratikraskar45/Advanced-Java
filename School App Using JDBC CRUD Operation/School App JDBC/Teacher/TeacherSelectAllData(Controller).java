package com.school.controller;

import com.school.dto.TeacherDto;
import com.school.service.TeacherService;

public class TeacherGetAll {
	public static void main(String[] args) {
		TeacherService teacherService=new TeacherService();
		
		//local declaration of Teacher class(Dto package class (Encapsulation))
		TeacherDto teacherDto=null;
		TeacherDto t=	teacherService.selectAllDataById(teacherDto);
		if(t!=null) {
			System.out.println(t);
		}	
	}
}
/*
Output=
2
viru
viru@mail.com
============================================
3
Dhawan
dhawan@mail.com
============================================

mysql get all teacher data

id  name    email
2	viru	viru@mail.com
3	Dhawan	dhawan@mail.com
*/	