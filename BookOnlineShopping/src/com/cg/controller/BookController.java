package com.cg.controller;


import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.pojo.Book;
import com.cg.service.BookService;
import com.cg.service.BookServiceImpl;


@WebServlet("*.app")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	BookService service=new BookServiceImpl();

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String action=request.getServletPath();
		System.out.println(action);
		switch(action)
		{
		case "/book.app":
			session.setAttribute("book", service.ViewAll());
			response.sendRedirect("books.jsp");
			break;
			
		case "/add.app":
			int id=Integer.parseInt(request.getParameter("bookId"));
			System.out.println(id);
			int cartcount=service.addNew(id);
			session.setAttribute("cartC", cartcount);
			System.out.println(service.ViewAll());
			response.sendRedirect("books.jsp");
			
			
			break;
		
		case "/view.app":
			System.out.println(service.ViewAll());
			session.setAttribute("cart", service.ViewAll());
			response.sendRedirect("cart.jsp");
			break;
		case "/remove.app":
			response.getWriter().append("Served at: ").append(request.getContextPath());
			  
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
