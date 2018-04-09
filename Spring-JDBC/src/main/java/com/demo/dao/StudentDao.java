package com.demo.dao;

import com.demo.model.Student;

public interface StudentDao {
	
	public void insert(Student student);
	
	public Student findByStudentId(int studId);

}
