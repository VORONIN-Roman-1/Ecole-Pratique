package com.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Client;
import com.demo.model.Commande;

@WebServlet("/EL")
public class ClientCommandeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Client> clients = new ArrayList<>();
		Client client1= new Client("Ivanov","Ivan",29);
		List <String> temp = new ArrayList<>();
		temp.add("Marseille");
		temp.add("Manosque");
		Client client2= new Client("Petrov","Petr",37, temp);
		clients.add(client1);
		clients.add(client2);
		req.setAttribute("clients", clients);
		Commande commande= new Commande ("Couteau", 9, 34.57);
		//req.setAttribute("client", client1);
		//req.setAttribute("commande", commande);
		
		
		this.getServletContext().getRequestDispatcher("/vue/ClientCommande.jsp").forward(req, resp);
	
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
