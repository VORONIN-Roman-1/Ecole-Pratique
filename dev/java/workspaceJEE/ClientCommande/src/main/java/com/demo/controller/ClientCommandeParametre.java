package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Client;
import com.demo.model.Commande;

@WebServlet("/EL/parametre")
public class ClientCommandeParametre extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String prenom = req.getParameter("prenom");
		int age =req.getParameter("age")==null?0:Integer.valueOf(req.getParameter("age")) ;
		
		String article = req.getParameter("article");
		int nombreArticle = req.getParameter("nombreArticle")==null? 0: Integer.valueOf(req.getParameter("nombreArticle")) ;
		double prix = req.getParameter("prix")==null? 0: Double.valueOf(req.getParameter("prix"));
		
		
		Client client= new Client(name,prenom,age);
		Commande commande= new Commande (article, nombreArticle, prix);
		
		
		//Client client= new Client("Ivanov","Ivan",29);
		//Commande commande= new Commande ("Couteau", 9, 34.57);
		req.setAttribute("client", client);
		req.setAttribute("commande", commande);
		
		
		this.getServletContext().getRequestDispatcher("/vue/ClientCommandeParametre.jsp").forward(req, resp);
	
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
