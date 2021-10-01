<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/resources/css/mon-css.css">
<script src="${pageContext.request.contextPath}/resources/js/un-script.js">
</script>
</head>
<body>
	Hello
	<a href="getSalutationForm">VER FORM</a>
	<img src="${pageContext.request.contextPath}/resources/images/spring.png">
 
 
 <hr>un bouton sur lequel j'ai un script js dans les resources statiques
<input type="button" onclick="jsMethodeName()" value="js test button"/> 
 
<div> un paragraphe mis en forme avec mon-css.css</div>
</body>
</html>