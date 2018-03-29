package com.demo.pojo;

public class StudentInfo {
	
	private String name;
	private long mobileNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	public void getStudentInfo() {
		System.out.println("Student Name="+name+" Student Mobile No."+mobileNo);
	}
	

}
