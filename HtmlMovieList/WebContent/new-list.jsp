<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New List</title>
</head>
<body>
	<form action="createNewListServlet" method="post">
		List Name: <input type="text" name="ListName"><br />
		
		Trip date: <input type="text" name="month" placeholder="mm" size="4"> <input type="text" name="day" placeholder="dd" size="4">,  <input type="text" name="year" placeholder="yyyy" size="4"> 
		Theater Name: <input type="text" name="TheaterName"><br />
		Available Movies:<br /> <select name="allMoviesToAdd" multiple size="8">
		
			<c:forEach items="${requestScope.allMovies}" var="currentitem">
				<option value="${currentitem.id}">${currentitem.movie} ${currentitem.raiting}
					${currentitem.mainCharacter}</option>
			</c:forEach>
		</select> <br /> <input type="submit" value="Create List and Add Items">
	</form>
	<a href="index.html">Go add new items instead.</a>
</body>
</html>
