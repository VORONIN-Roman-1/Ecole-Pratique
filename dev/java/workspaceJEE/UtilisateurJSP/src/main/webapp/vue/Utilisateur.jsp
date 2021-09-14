<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String nom = "Utilisateur";
int age = 20;
String[] tab = {"Jurassic Park", "Star Wars", "Retour vers le futur"}; %>
<p> <%= nom %> </p>
<% String s= age>18?"Tu es majeur":"Tu es mineur" ; %>
<p> <%= s %> </p>
<table style="border: 2px solid #333">
<tr>
<% for (String film : tab) { %>
 <td style="border: 1px solid #333"><%= film %> </td>
	
<% } %>
</tr>
 </table>
</body>
</html>