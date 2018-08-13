package com.cg.dao;

import java.util.Collection;
import java.util.Map;

import com.cg.pojo.Book;

public interface BookDao {

	void addNew(Book book);

	public void deleteBook(int bookId);

	Collection<Book> ViewAll();
	
	Map<Integer,Book> allBooks();

}
