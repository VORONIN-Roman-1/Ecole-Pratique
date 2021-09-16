<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" >
<title>Insert title here</title>
</head>
<body>
	<form action="#" style="width:400px">
	  <fieldset style="width:400px">
	    <legend>client :</legend>
	    <label for="fname">Nom:</label>
	    <input type="text" id="fname" name="fname" value="${client.nom}"><br><br>
	    <label for="lname">Prenom:</label>
	    <input type="text" id="lname" name="" value="${client.prenom}"><br><br>
	    <label for="age">Age:</label>
	    <input type="text" id="age" name="" value="${client.age}"><br><br>
	    <label for="Adresse2">Adresse2:</label>
	    <input type="text" id="Adresse2" name="" value="${client.adresse[1]}"><br><br>
	  </fieldset>
	</form>
	<form action="#" style="width:400px">
	  <fieldset style="width:400px">
	    <legend>commande :</legend>
	    <label for="article">Article:</label>
	    <input type="text" id="article" name="fname" value="${commande.article}"><br><br>
	    <label for="nombreArticle">Quantité:</label>
	    <input type="text" id="nombreArticle" name="" value="${commande.nombreArticle}"><br><br>
	    <label for="prix">Prix:</label>
	    <input type="text" id="prix" name="" value="${commande.prix}$"><br><br>
	    <label for="prixTotal">Prix Total:</label>
	    <input type="text" id="prixTotal" name="" value="${commande.nombreArticle * commande.prix} $"><br><br>
	  </fieldset>
	</form>
	
</body>
</html>