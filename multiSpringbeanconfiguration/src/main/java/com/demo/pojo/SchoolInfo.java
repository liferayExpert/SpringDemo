package com.demo.pojo;

public class SchoolInfo {
	
	private String schoolName;
	private String schoolAddress;
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	
	public void getStudentInfo() {
		
		System.out.println("School Name="+schoolName+" School Address."+schoolAddress);
	}
}
