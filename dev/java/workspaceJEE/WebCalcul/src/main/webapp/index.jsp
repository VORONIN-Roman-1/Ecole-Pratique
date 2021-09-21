<%@page import="com.cci.ep.calcul.CalculMetier" %>
<%
double a = 0;
double b = 0;
double res = 0;

String action = request.getParameter("action");

if ( action != null)
{
	a = Double.parseDouble(request.getParameter("a"));
	b = Double.parseDouble(request.getParameter("b"));
	CalculMetier metier = new CalculMetier();
	if (action.equals("Somme"))
	{ res = metier.somme(a, b); }
	else if (action.equals("Produit"))
	{ res = metier.produit (a,b); }
}
%>
<html>
<body>
	<h1>TROLOLOLOL ESPECE DE BATARD</h1>
	<form action="index.jsp" method="post">
		<table>
			<tr>
				<td> A: </td> <td><input type="text" name="a" value="<%=a%>"/> </td>
				<td> B: </td> <td><input type="text" name="b" value="<%=b%>"/> </td>
			</tr>
			<tr>
				<td> Action :</td> <td><%= action %></td>
				<td> res :</td> <td><%= res %></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="Somme"/> </td>
				<td><input type="submit" name="action" value="Produit"/> </td>
			</tr>
			<tr>
				<td> Resultat </td> <td> <%=res %> </td>
			</tr>
		</table>
	</form>
</body>
</html>