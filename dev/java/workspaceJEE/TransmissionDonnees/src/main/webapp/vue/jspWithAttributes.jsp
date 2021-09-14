<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>With Attributes</title>
</head>
<body>
<h1>With Attributes</h1>
<p>nom : <%= (String) request.getAttribute("nom")
%> </p>
<% Integer ageInJsp = (Integer)
request.getAttribute("age"); %>
<p>age : <%= ageInJsp %> </p>

<% if(ageInJsp > 18) { %>
<p>Tu es majeur.</p>
<%} else { %>
<p>Tu es mineur.</p>
<%} %>
<h2>Films préférés</h2>
<table>
<% String[] tab = (String[])
request.getAttribute("tab");
for(int i=0;i<tab.length;i++) {
%>
<tr><td><%= tab[i] %></td></tr>
<%
}
%>
</table>
</body>
</html>