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
<form:select path="pays">
<form:option value="Brésil" label="Brésil"/>
<form:option value="France" label="France"/>
<form:option value="Allemagne" label="Allemagne"/>
<form:option value="Inde" label="Inde"/>
</form:select>
<input type="submit" value="valider"/>
</form:form>

</body>
</html>