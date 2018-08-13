package com.book.dao;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.book.pojo.Book;



public class BookDaoImpl implements BookDao {
	
	public static Set<Book> books = new HashSet<>();
	public static Map<Integer,Book> cartItems = new HashMap<>();
	private int cartCount=0;
	
	Book booka=new Book(101,"C","Dennis Ritchie","C is programming language",890,1);
	Book bookb=new Book(121,"C++","","hfghhh",800,1);
	Book bookc=new Book(123,"JAVA","James Gosling","Java is platform independent",589,1);
	Book bookd=new Book(134,"C#","Anders Hejlsberg","Programming language",900,1);
	Book booke=new Book(145,"Head First Java","Bruce Akles","Book for learning java core",800,1);
	

	//adding books to set and displaying
	@Override
	public Set<Book> viewAllBooks() {
		books.add(booka);
		books.add(bookb);
		books.add(bookc);
		books.add(bookd);
		books.add(booke);
		return books;
	}
	
	@Override
	public int getCartCount() {
		return cartCount;
	}


	


}