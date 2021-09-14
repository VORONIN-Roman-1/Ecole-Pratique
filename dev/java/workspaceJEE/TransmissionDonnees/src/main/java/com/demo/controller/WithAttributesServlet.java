package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/avecAttributs")
public class WithAttributesServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		String nom = "Utilisateur";
		Integer age = 20;
		String[] tab = { "Jurassic Park", "Star Wars", "Retour vers le futur" };
		request.setAttribute("nom", nom);
		request.setAttribute("age", age);
		request.setAttribute("tab", tab);
		this.getServletContext().getRequestDispatcher("/vue/jspWithAttributes.jsp"

		).forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		doGet(request, response);
	}

}
