package com.book.service;

import java.util.Set;

import com.book.dao.BookDaoImpl;
import com.book.pojo.Book;

public class BookServiceImpl implements BookService {

	BookDaoImpl dao = new BookDaoImpl();

	@Override
	public Set<Book> viewAllBooks() {
		//retrieving books from set
		Set<Book> books = (Set<Book>) dao.viewAllBooks();
		return books;
	}

}
