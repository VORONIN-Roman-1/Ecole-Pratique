<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="#">
	  <fieldset style="width:400px">
	    <legend>client:</legend>
	    <label for="fname">Nom:</label>
	    <input type="text" id="fname" name="fname" value="<%= request.getAttribute("name") %>"><br><br>
	    <label for="lname">Prenom:</label>
	    <input type="text" id="lname" name="" value="<%= request.getAttribute("prenom") %>"><br><br>
	    <label for="lname">Age:</label>
	    <input type="text" id="lname" name="" value="<%= (Integer)request.getAttribute("age") %>"><br><br>
	  </fieldset>
	</form>
	<form action="#">
	  <fieldset style="width:400px">
	    <legend>commande:</legend>
	    <label for="fname">Article:</label>
	    <input type="text" id="fname" name="fname" value="<%= request.getAttribute("article") %>"><br><br>
	    <label for="lname">Quantité:</label>
	    <input type="text" id="lname" name="" value="<%= (Integer)request.getAttribute("nombreArticle") %>"><br><br>
	    <label for="lname">Prix:</label>
	    <input type="text" id="lname" name="" value="<%= (Double)request.getAttribute("prix")  %>$"><br><br>
	    <label for="lname">Prix Total:</label>
	    <input type="text" id="lname" name="" value="<%= (Double)request.getAttribute("prix")* (Integer)request.getAttribute("nombreArticle")%> $"><br><br>
	  </fieldset>
	</form>
	<h1>Hello</h1>
	<p>Name: <%= request.getAttribute("name") %> </p>
	<p>Premon: <%= request.getAttribute("prenom") %> </p>
	<p><%= (Integer)request.getAttribute("age") %> </p>
	<h2>Votre commande</h2>
	<p><%= request.getAttribute("article") %> </p>
	<p><%= (Integer)request.getAttribute("nombreArticle") %> </p>
	<p><%= (Double)request.getAttribute("prix") %> $ </p>
	<p><%= (Double)request.getAttribute("prix")* (Integer)request.getAttribute("nombreArticle")%> $ </p>
</body>
</html>