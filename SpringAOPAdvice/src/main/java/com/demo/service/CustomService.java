package com.demo.service;

public class CustomService {
	
	private String name;
	
	private String url;

	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}
	
	public void printThrowException() {
		throw new IllegalArgumentException();
	}

	@Override
	public String toString() {
		return "CustomService [name=" + name + ", url=" + url +"]";
	}
	
	

}
