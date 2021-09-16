package com.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Abonne;
import com.demo.model.Film;

@WebServlet("/abonne")
public class HelloWorldJSTL extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Film film = new Film("Titanic", "James Cameron", 195, true);
		req.setAttribute("film", film);
		
		Film film1 = new Film("Men in Black", "Barry Sonnenfeld", 98 , false);
		Film film2 = new Film("Back to the Future", "Robert Zemeckis", 116, true);
		Film film3 = new Film("Fight Club", "David Fincher", 139 , false);
		
		List<Film> films = new ArrayList<>(); 
		films.add(film1);
		films.add(film2);
		films.add(film3);
		films.add(film);
		
		Abonne abonneDuo= new Abonne("Ivan", "Ivanov", "586 rue de la Republique 13100 Aix-en-Provance");
		Abonne abonne= new Abonne("Jacques", "Martin", 2, "56 rue de la Boustifaille 75012 PARIS", films, abonneDuo );
		req.setAttribute("abonne", abonne);
		
		//req.setAttribute("abonneDuo", abonneDuo);
		
		
		this.getServletContext().getRequestDispatcher("/vue/Abonne.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	

}
