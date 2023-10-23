package com.school.controller;

import com.school.service.TeacherService;


public class TeacherUpdate {
	public static void main(String[] args) {
		
		TeacherService teacherService=new TeacherService();
		
		//pass the value to the method which is updated
		int a=	teacherService.updateTeacherEmailById(2, "viru@mail.com","viru");
		System.out.println(a);
	}
	
}

/*
Output=
1

Mysql teacher data updated

id  name    email
2	viru	viru@mail.com
3	Dhawan	dhawan@mail.com
*/	

