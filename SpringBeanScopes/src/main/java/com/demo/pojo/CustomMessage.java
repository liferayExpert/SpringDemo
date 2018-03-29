package com.demo.pojo;

public class CustomMessage {
	
	
	private String message;
	
	public String getMessage() {
		return message;
	}

	public CustomMessage() {
		
		System.out.println("Constructor initialization");
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getCustomMessage()
	{
		System.out.println(message);
	}

}
