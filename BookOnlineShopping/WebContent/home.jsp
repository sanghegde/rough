<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<div allign=right>
<a href="cart.app">cart</a>
</div>
<h1>Book List</h1>
<table>
<tr>
<th>BookName</th>
<th>id</th>
</tr>
<jstl:forEach var="book" items="${requestScope.books }">
<tr>
<td>${book.bookName}</td>
<td>${book.id}</td>
<td>
<a href="add.app?bookName=${book.bookName }">Add to cart</a>
</td>
</tr>

</jstl:forEach>




</table>

</body>
</html>