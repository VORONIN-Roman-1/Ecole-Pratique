<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
 
	<title>Liste d'utilisateurs</title>
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />


</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2> CRM - gestionnaire d'Utilisateur</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
		
		<!-- insérer un nouveau bouton Ajouter Utilisateur  -->
		<input type="button" value="Ajout User" 
		onclick="window.location.href='montrerFormulaireCreate'; return false;"
		class="add-button"/>
		<!--  montrerFormulaireCreate va appeler une méthode mappée dans le controleur , méthode mappée à définir  -->
		
		<br>
		<!--   search box -->
            <form:form action="search" method="GET">
                Search user: <input type="text" name="searchedName" />
                
                <input type="submit" value="Search" class="add-button" />
            </form:form>
		
		
		<!-- ajouter le tableau html ici -->
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<!--  boucle sur nos users -->
				<c:forEach var="tempUser" items="${users}">

					<tr>
						<td>${tempUser.firstName}</td>
						<td>${tempUser.lastName}</td>
						<td>${tempUser.email}</td>
						 <td>
						 <!--  afficher le lien "update"  href = var définie juste au dessus -->
						 <a href="${pageContext.request.contextPath}/user/montrerFormulaireUpdate?id=${tempUser.id}">Update</a>
						 | 
						 <a href="${pageContext.request.contextPath}/user/delete?id=${tempUser.id}" 
						 onclick="if (!(confirm('Souhaitez-vous réellement supprimer cet Utilisateur ?'))) return false">Delete</a>
						 </td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>