package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WithParametersServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)

throws ServletException, IOException {

String pageInServlet = request.getParameter("page");
Integer nbElementsInServlet = null;
if(request.getParameter("nbElements") != null) {
nbElementsInServlet = Integer.valueOf(request.getParameter("nbElements"));
}
// Pour montrer qu'on peut manipuler ?galement ici les param?tres
// On va les utiliser pour les afficher dans la console
System.out.println("Le num?ro de la page est : " + pageInServlet);
System.out.println("Le double du nombre d'?l?ments est : " + (nbElementsInServlet * 2));
this.getServletContext().getRequestDispatcher( "/vue/jspWithParameters.jsp"

).forward( request, response );

}
public void doPost(HttpServletRequest request, HttpServletResponse response)

throws ServletException, IOException {

doGet(request, response);
}
}