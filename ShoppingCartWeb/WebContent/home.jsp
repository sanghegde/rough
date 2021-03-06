<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shop</title>
</head>
<body>
<div>
		<jsp:include page="header.jsp"></jsp:include>
</div>
<div style="align: center;">
	<h1>Books List</h1>

		<table>
			<tr>
				<th>Book Name</th>
  				<th>Author Name</th>
  				<th>Description</th>
  				<th>Price</th>
				
			</tr>
			<jstl:forEach var="book" items="${requestScope.books}">
				<tr>
				<!--retrieving the details about book and displaying  -->
					<td>${book.bookName}</td>
					<td>${book.authorName}</td>
					<td>${book.description}</td>
					<td>${book.price}</td>
					<td><a href="add.app?bookId=${book.bookId}">Add to Cart</a></td> 	

				</tr>
			</jstl:forEach>
		</table>

   </div>	
<div>
	<jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>