package com.school.controller;


import com.school.service.TeacherService;

public class TeacherDeleteController {
	public static void main(String[] args) {
		
		TeacherService teacherService=new TeacherService();
		
		//Delete record in teacher table by id
		boolean res=	teacherService.deleteTeacherById(1);
		System.out.println(res);
		
	}

}
/*
Output=
true

mysql delete teacher data id=1

id  name    email
2	Rahul	rahul@mail.com
3	Dhawan	dhawan@mail.com
*/
		