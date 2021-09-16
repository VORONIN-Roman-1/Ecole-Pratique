<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" >
	<style>
           
            
     </style>
</head>
<body>
	<div>
		<h4>Abonne</h4>
		<p>Prénom : <c:out value="${abonne.prenom}"></c:out></p>
		<p>Nom : <c:out value="${abonne.nom}"></c:out></p>
		<p>Type Abonnement :
			<c:choose>
				<c:when test="${abonne.typeAbonnement==1}">Abonnement Classique</c:when>
				<c:when test="${abonne.typeAbonnement==2}">Abonnement Duo</c:when>
				<c:when test="${abonne.typeAbonnement==3}">Abonnement Premium</c:when>
				<c:otherwise> Aucun Abonnement</c:otherwise>
			</c:choose>
		</p>
		<p>Adresse : <c:out value="${abonne.adresse}"></c:out></p> 
		<c:if test="${abonne.typeAbonnement==2}">
			<p>Abonne DUO	</p>
			<p>Prénom : <c:out value="${abonne.abonneDuo.prenom}"></c:out></p>
			<p>Nom : <c:out value="${abonne.abonneDuo.nom}"></c:out></p>
			<p>Adresse : <c:out value="${abonne.abonneDuo.adresse}"></c:out></p> <br>
		</c:if>
		<br>
	</div>
	<table>
		<tr>
		<th>Titre</th>
		<th>Realisateur</th>
		<th>Duree</th>
		<th>Est vu</th>
		</tr>
		<c:forEach var="filmEnCours" items="${abonne.films}">
			<c:forEach var="ghfgg" items="${abonne.films}">
			</c:forEach>
			<tr>
				<td><c:out value="${filmEnCours.titre}"></c:out></td>
				<td><c:out value="${filmEnCours.realisateur}"></c:out></td>
				<td> <c:out value="${filmEnCours.duree}"></c:out></td>
				<td><c:out value="${filmEnCours.estVu}"></c:out></td>
			</tr>
		</c:forEach>
		
	</table>
	<div>
		<p>L’abonné n’a pas vu:</p>
		<ol>
			<c:forEach var="filmEnCours" items="${abonne.films}">
				<c:if test="${!filmEnCours.estVu}">
					<li><c:out value="${filmEnCours.titre}"></c:out></li>
				</c:if>
			</c:forEach>
		</ol>
	</div>
	
	<div>
		<h4>Les films dont la durée est supérieure à 120:</h4>
		<table>
			<tr>
			<th>Titre</th>
			<th>Realisateur</th>
			<th>Duree</th>
			<th>Est vu</th>
			</tr>
			<c:forEach var="filmEnCours" items="${abonne.films}">
				<c:if test="${filmEnCours.duree>120}">
					<tr>
						<td><c:out value="${filmEnCours.titre}"></c:out></td>
						<td><c:out value="${filmEnCours.realisateur}"></c:out></td>
						<td> <c:out value="${filmEnCours.duree}"></c:out></td>
						<td><c:out value="${filmEnCours.estVu}"></c:out></td>
					</tr>
				</c:if>
			</c:forEach>
			
		</table>
	</div>
	<div>
		<h4>Film</h4>
		<p>Titre : <c:out value="${film.titre}"></c:out></p>
		<p>Realisateur : <c:out value="${film.realisateur}"></c:out></p>
		<p>Duree : <c:out value="${film.duree}"></c:out></p>
		<p>Est vu : <c:out value="${film.estVu}"></c:out></p>
	</div>
	
</body>
</html>