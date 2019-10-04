<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie List</title>
</head>
<body>
	<form method="post" action="navigationServlet">
		<table>
			<c:forEach items="${requestScope.AllMovie}" var="movies">
				<tr>
					<td><input type="radio" name="ID" value="${movies.id}"></td>
					<td>${movies.movie}</td>
					<td>${movies.raiting}</td>
					<td>${movies.mainCharacter}</td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="edit" name="doThisToMovie"> <input
			type="submit" value="delete" name="doThisToMovie"> <input
			type="submit" value="add" name="doThisToMovie">
	</form>
</body>
</html>