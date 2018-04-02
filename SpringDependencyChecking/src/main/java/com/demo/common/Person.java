package com.demo.common;

import org.springframework.beans.factory.annotation.Required;

public class Person {
	
	private String name;
	
	private int age;
	

	public String getName() {
		return name;
	}
	
	@Required
	
	/*This value requied to add is Bean.xml otherwise you will get exception */
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void gerpersonDetails() {
		System.out.println("Person Name :"+name+" Person Age :"+age);
	}

}
