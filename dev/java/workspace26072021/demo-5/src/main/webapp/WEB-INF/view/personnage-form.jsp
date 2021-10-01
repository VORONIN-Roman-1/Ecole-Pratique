<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>.error{color:red}</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="personnage" >
		Prénom: <form:input path="prenom"/> <br><br>
		Nom:(*)<form:input path="nom"/>
		<form:errors path="nom" cssClass="error"/> <br><br>
		<input type="submit">
	</form:form>
</body>
</html>