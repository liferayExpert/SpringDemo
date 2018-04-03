package com.demo.model;

public class Science {
	
	private String bookName;


	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Science [bookName=" + bookName + "]";
	}
}
