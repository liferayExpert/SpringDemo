package com.demo.pojo;

public class TeacherInfo {
	
	private String name;
	private String subject;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void getTeacherinfo() {
		System.out.println("Teacher Name="+name+" Teacher Subject."+subject);
	}

}
