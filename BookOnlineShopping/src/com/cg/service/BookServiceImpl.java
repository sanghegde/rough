package com.cg.service;

import java.util.Collection;

import com.cg.dao.BookDao;
import com.cg.dao.BookDaoImp;
import com.cg.pojo.Book;

public class BookServiceImpl implements BookService {
	
	private BookDao dao=new BookDaoImp();
	static int count=0;
	

	
	
		
	@Override
	public String addToCart(String bookName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int deleteBook(int bookId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<Book> ViewAll() {
		return dao.ViewAll();
	}
	@Override
	public int addNew(int id) {
		boolean check=true;
		count++;
		for(Book book:ViewAll())
		{
			if(book.getId()==id)
			{
				book.setCount(book.getCount()+1);
				check=false;
				break;
			}
		}
		
		if(check)
		{
			dao.addNew(dao.allBooks().get(id));
		}
		
		return count;
	}
	}
	
	
	


