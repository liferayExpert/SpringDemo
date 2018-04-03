package com.demo.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentBean")
public class Student {
	@Value("123")
	private int rollno;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	@Value("Bhavesh")
	private String stuName;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [rollno "+rollno+" stuName "+stuName+"]";
	}

}
