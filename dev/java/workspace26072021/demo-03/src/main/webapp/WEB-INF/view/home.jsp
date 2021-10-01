<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/resources/css/mon-css.css">
 <script src="${pageContext.request.contextPath}/resources/js/un-script.js">
</script>
<meta charset="UTF-8">
<title>Hello World via SPRING</title>
</head>
<body>
	<h1>Hello World via SPRING</h1>
	<a href="getSaluttationForm">Hello Spring MVC Form</a>
	une ressource statique ici:
	<img src="${pageContext.request.contextPath}/resources/images/spring.png">
 
 
 <hr>un bouton sur lequel j'ai un script js dans les resources statiques
<input type="button" onclick="jsMethodeName()" value="js test button"/> 

	<div>un paragraphe mis en form avec mon-css.css</div>
	<a href="afficheFormulaire">afficheFormulaire</a>
</body>
</html>