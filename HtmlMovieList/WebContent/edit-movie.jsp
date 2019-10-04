<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit a list</title>
</head>
<body>
	<form action="editExistingTheaterServlet" method="post">
		List Name: <input type="text" name="listName"
			value="${TheMovies.listName}"><br /> 
			Trip date: <input type="text" name="month" placeholder="mm" size="4" value="${TheMovies.tripDate.getMonthValue()}"> 
			<input type="text" name="day" placeholder="dd" size="4" value="${TheMovies.tripDate.getDayOfMonth()}">, 
			<input type="text" name="year" placeholder="yyyy" size="4" value="${TheMovies.tripDate.getYear()}"> Shopper Name:
			<input type="text" name="theatername" value="${TheMovies.theater.theatername}">
			<br />
			 <input type="hidden" name="id" value="${TheMovies.id}"> Current
		Items:
		<br /> 
		<select name="currentItems" multiple size="6">
			<c:forEach var="listVal" items="${TheMovies.listOfMovies}">
				<option value="${listVal.id}">${listVal.movie}|
					${listVal.raiting}|${listVal.mainCharacter}</option>
			</c:forEach>
		</select> <br /> Remaining Items:<br /> <select name="itemsToAdd" multiple
			size="6">
			<c:forEach items="${requestScope.AllMoviesListed}" var="currentitem">
				<option value="${currentitem.id}">${currentitem.movie}|
					${currentitem.raiting}|${currentitem.mainCharacter}</option>
			</c:forEach>
		</select> <br /> <input type="submit" value="Edit List and Edit Items">
	</form>
	<a href="index.html">Go add new items instead.</a>
</body>

</html>