package com.book.controller;

import com.book.controller.*;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.book.pojo.Book;
import com.book.service.*;
import com.book.service.BookServiceImpl;

@WebServlet("*.app")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookService service = new BookServiceImpl();
	Cart cart = new Cart();


	public BookServlet() {
		super();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		System.out.println(action);
		HttpSession session = request.getSession();
		session = request.getSession();
		session.setAttribute("cartCount", cart.getCartCount());
		session.setAttribute("cartItems", cart.viewCart());

		switch (action) {
		// adding elements to cart
		case "/add.app":
			String bookId = request.getParameter("bookId");
			cart.addBookToCart(Integer.parseInt(bookId));

			System.out.println(Cart.cartItems);
			response.sendRedirect("refresh.app");
			break;
		// refresh page that will run in backend and will display home page
		case "/refresh.app":
			Set<Book> books = service.viewAllBooks();
			request.setAttribute("books", books);
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
			break;
		// to view the cart elements
		case "/viewcart.app":

			System.out.println("HIIII");
			response.sendRedirect("cartdetails.jsp");
			System.out.println("********");
			break;
		// to remove elements from cart
		case "/remove.app":
			bookId = request.getParameter("bookId");
			cart.deleteBookFromCart(Integer.parseInt(bookId));
			System.out.println(Cart.cartItems);
			response.sendRedirect("viewcart.app");

			break;
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}