package com.cg.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.pojo.Book;

public class BookDaoImp implements BookDao {
	
	static Map<Integer, Book> bookDb = new HashMap<>();
	List<Book> list = new ArrayList<Book>();
	
	
	static Book book1=new Book("c", 1);
	static Book book2=new Book("c++", 2);
	
	static
	{
		bookDb.put(book1.getId(), book1);
		bookDb.put(book2.getId(), book2);
		
	}
	
	@Override
	public void addNew(Book book) {
		list.add(book);
		
	}

	@Override
	public void deleteBook(int bookId) {
		bookDb.remove(bookId);
		
	}

	@Override
	public Collection<Book> ViewAll() {
		
		return list;
	}



@Override
public Map<Integer, Book> allBooks() {
	
	return bookDb;
}
}
