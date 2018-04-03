package com.demo.common;

public class Address {
	
	private Student student;

	public Address(Student student) {
		this.student = student;
	};
	
	
	private String address;

	/*public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}
*/

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Address [student=" + student + ", address=" + address + "]";
	}
	

}
