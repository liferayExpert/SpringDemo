package com.demo.common;

public class College {
	
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
@Override
public String toString() {
	return "College [Student : "+student+"]";
}
}
