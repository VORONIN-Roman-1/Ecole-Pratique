<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h4>Film</h4>
		<p>Titre : <c:out value="${film.titre}"></c:out></p>
		<p>Realisateur : <c:out value="${film.realisateur}"></c:out></p>
		<p>Duree : <c:out value="${film.duree}"></c:out></p>
		<p>Est vu : <c:out value="${film.estVu}"></c:out></p>
	</div>
</body>
</html>