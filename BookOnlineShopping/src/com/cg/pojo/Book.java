package com.cg.pojo;

public class Book {
	private String bookName;
	private int id;
	private int count;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Book(String bookName, int id) {
		super();
		this.bookName = bookName;
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", id=" + id + "]";
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
