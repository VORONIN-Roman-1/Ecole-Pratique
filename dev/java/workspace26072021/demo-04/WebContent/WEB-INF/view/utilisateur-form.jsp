<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
<form:form action="processForm" modelAttribute="utilisateur" >
Prénom: <form:input path="prenom" /> 
<br><br>
Nom: <form:input path="nom" />
<br><br>
<input type="submit" value="valider"/>
</form:form>

</body>
</html>