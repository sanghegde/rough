<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="jstl"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<form action:"save.app" method="get">
<input type="number" name="bookId" required="required" value="${requestScope.Book.bookId}" }/>
<input type="text"  name="bookName" required="required"/>
</form>
</div>


</body>
</html>