package com.book.dao;

import java.util.Collection;
import java.util.Set;

import com.book.pojo.Book;



public interface BookDao {


	Set<Book> viewAllBooks();
	int getCartCount();
	

}


