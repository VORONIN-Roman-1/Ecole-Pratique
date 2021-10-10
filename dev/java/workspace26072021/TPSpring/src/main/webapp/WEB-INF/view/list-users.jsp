<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des users</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - gestionnaire d'Utilisateur</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		<!-- ajouter le tableau html ici -->
			<table>
				<tr>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Email</th>
				</tr>
		
				<c:forEach var="temp" items="${users}">
					<tr>
						<td>${temp.firstName}</td>
						<td>${temp.lastName}</td>
						<td>${temp.email}</td>
					</tr>
				</c:forEach>
		
			</table>
		</div>
	</div>
</body>
</html>