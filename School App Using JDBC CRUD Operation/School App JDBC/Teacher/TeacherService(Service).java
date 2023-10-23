package com.school.service;

import com.school.dao.TeacherDao;
import com.school.dto.TeacherDto;

public class TeacherService {
	TeacherDao teacherDao=new TeacherDao();
	
	
	// delete teacher table data
	public boolean deleteTeacherById(int id) {
		boolean res=teacherDao.deleteTeacherById(id);
		return res;
		
	}
	
	//insert teacher table data
	public TeacherDto savedTeacher(TeacherDto teacherDto) {
	TeacherDto t=	teacherDao.savedTeacher(teacherDto);
	return t;
	}
	
	
	//update teacher table data
	public int updateTeacherEmailById(int id,String email,String name) {
		return teacherDao.updateTeacherEmailById(id, email,name);
	}
	
	
	//get all record of teacher table
	public TeacherDto selectAllDataById(TeacherDto teacherDto) {
		return teacherDao.selectAllDataById(teacherDto);
	}

}
