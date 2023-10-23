package com.school.service;

import com.school.dao.StudentDao;
import com.school.dto.Student;

public class StudentService {
	StudentDao studentDao=new StudentDao();
	
	//get all record of student table
	public Student selectAll(Student student) {
		Student s=studentDao.selectAll(student);
		return s;
	}
	
	
	//update student table data
	public int updateStudent(int id,String name,String email) {
	int res=studentDao.updateStudent(id,name,email);
	return res;
	}
	
	
	// delete student table data
	public boolean deleteStudentById(int id) {
	boolean res=studentDao.deleteStudentById(id);
	return res;
	} 
	
	
	//insert student table data
	public Student saveStudent(Student student) {
		Student s=studentDao.saveStudent(student);
		return s;
		
	}
	

}
