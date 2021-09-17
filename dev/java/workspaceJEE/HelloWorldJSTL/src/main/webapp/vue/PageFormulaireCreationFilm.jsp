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
	<form method="get" action="enregistrerFilm">
		<fieldset>
				<legend>Nouvel film</legend>
				<p>Vous pouvez décrire la film via ce formulaire.</p>
              
				Titre 
				<input type="text" id="nom" name="titre"  value="<c:out value="${titre}"></c:out>" /> 
				
				<c:if test= "${titre.length() <5}"> <span> Obligatoire et plus 4 lettre! </span>
				</c:if>
				<br />
				
				Realisateur
				<input type="text" id="age" name="realisateur" value="<c:out value="${realisateur}"></c:out>"  />
				<c:if test="${realisateur.length() <5}"> <span> Obligatoire et plus 4 lettre! </span>
				</c:if>
				<br />
				
				Duree
				<input type="number" id="duree" name="duree" value ="<c:out value="${duree}"></c:out>"  />
				
				<c:choose>
					<c:when test="${duree==null}"></c:when>
					<c:when test="${duree==''}">
						<span> Obligatoire et plus 0 minute! </span>
					</c:when> 
					<c:otherwise>
						<c:if test="${Integer.valueOf(duree) <=0}"> <span> Obligatoire et plus 0 minute! </span>
						</c:if>
					</c:otherwise>
					
				</c:choose>

				<br />
				Est vue ?
				<input type="radio" name="estVue" value="true" <c:if test="${estVue==true}"> checked </c:if> /> OUI
				<input type="radio" name="estVue" value="false" <c:if test="${estVue==false}"> checked </c:if>/> NON
				
				<br />
				<label for="typeFilm">Type de Film:</label>
				<select id="typeFilm" name="typeFilm">
                    <%-- <option value="action" <c:if test="${typeFilm.equal('action')}"> selected </c:if> >Action</option>
                    <option value="comedie" <c:if test="${typeFilm.equal('comedie')}"> selected </c:if>>Comédie</option>
                    <option value="scienceFiction" <c:if test="${typeFilm.equal('scienceFiction')}"> selected </c:if>>Science-Fiction</option>
                    <option value="drame" <c:if test="${typeFilm.equal('drame')}"> selected </c:if>>Drame</option>
                    <option value="autres" <c:if test="${typeFilm.equal('autres')}"> selected </c:if>>Autres</option> --%>
                    <option value="action" <c:if test="${typeFilm.equals('action')}"> selected </c:if> >Action</option>
                    <option value="comedie" <c:if test="${typeFilm.equals('comedie')}"> selected </c:if> >Comédie</option>
                    <option value="scienceFiction" <c:if test="${typeFilm.equals('scienceFiction')}"> selected </c:if>>Science-Fiction</option>
                    <option value="drame" <c:if test="${typeFilm.equals('drame')}"> selected </c:if>>Drame</option>
                    <option value="autres" <c:if test="${typeFilm.equals('autres')}"> selected </c:if>>Autres</option>
                </select>
				<input type="submit" value="Envoyer" />
				<br />
		
          </fieldset>
	</form>
</body>
</html>