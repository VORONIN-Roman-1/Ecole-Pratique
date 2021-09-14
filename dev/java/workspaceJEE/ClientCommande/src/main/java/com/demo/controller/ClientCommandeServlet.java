package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class ClientCommandeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("name", "Ivanov");
		req.setAttribute("prenom", "Ivan");
		req.setAttribute("age", Integer.valueOf(18));
		req.setAttribute("article","Couteau" );
		req.setAttribute("nombreArticle", Integer.valueOf(5) );
		req.setAttribute("prix", Double.valueOf(77.67) );

		
		this.getServletContext().getRequestDispatcher("/vue/ClientCommande.jsp").forward(req, resp);
	
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
