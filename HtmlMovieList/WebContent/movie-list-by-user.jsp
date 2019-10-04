
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping Lists</title>
</head>
<body>
	<form method="post" action="ListNavigationServlet">
		<table>
			<c:forEach items="${requestScope.allTheater}" var="currentlist">
				<tr>
					<td><input type="radio" name="id" value="${currentlist.id}"></td>
					<td><h2>${currentlist.listName}</h2></td>
				</tr>
				<tr>
					<td colspan="3">Trip Date: ${currentlist.tripDate}</td>
				</tr>
				<tr>
					<td colspan="3">Theater: ${currentlist.theater.theatername}</td>
				</tr>
				<c:forEach var="listVal" items="${currentlist.listOfMovies}">
					<tr>
						<td></td>
						<td colspan="3">${listVal.movie},
						${listVal.raiting},
						${listVal.mainCharacter}</td>
					</tr>
				</c:forEach>
</c:forEach>
		</table>
		<input type="submit" value="edit" name="doThisToItem">  <input
			type="submit" value="add" name="doThisToItem">
	</form>
	<br />
	<a href="addMoviesForListServlet">Create a new list</a>
	<a href="index.html">Insert a new item</a>
</body>
</html>
