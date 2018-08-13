package com.cg.service;

import java.util.Collection;

import com.cg.pojo.Book;

public interface BookService {

	int addNew(int id);

	Collection<Book> ViewAll();

	public String addToCart(String bookName);

	int deleteBook(int bookId);

}
