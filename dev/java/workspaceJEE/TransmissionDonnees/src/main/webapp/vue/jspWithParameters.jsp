<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP avec Paramètres</title>
</head>
<body>
<h1>JSP avec Paramètres</h1>
<%
Boolean majeurInJsp = false;
if(request.getParameter("majeur")!=null) {
majeurInJsp = Boolean.valueOf(

request.getParameter("majeur"));

}
String nomInJsp = request.getParameter("nom");
%>

<p>
nom : <%= nomInJsp %> <br/>
<% if(majeurInJsp) { %>
Tu es majeur.
<%} else { %>
Tu es mineur.
<%} %>
</p>
</body>
</html>