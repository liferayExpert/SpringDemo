package com.demo.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*use SpEL to inject values into property*/

@Component("collegeBean")
public class College {
	
	@Value("#{studentBean}")
	private Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Value("#{studentBean.stuName}")
	private String name;
	
	@Override
	public String toString() {
		return "College [student "+student+" stuName "+name+"]";
	}
}
