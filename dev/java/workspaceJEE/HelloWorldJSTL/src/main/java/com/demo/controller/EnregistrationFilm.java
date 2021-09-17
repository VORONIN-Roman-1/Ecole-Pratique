package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Film;

@WebServlet("/enregistrerFilm")
public class EnregistrationFilm extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titre = req.getParameter("titre");
		String realisateur = req.getParameter("realisateur");
		System.out.println(realisateur+ " re");
		String duree= req.getParameter("duree");
		String estVue= req.getParameter("estVue");
		String typeFilm= req.getParameter("typeFilm");
		if (titre == "" || titre.length() < 5|| realisateur=="" || realisateur.length()<5  || duree=="" || Integer.valueOf(duree) <=0) {
			
			req.setAttribute("titre", titre);
			req.setAttribute("realisateur", realisateur);
			req.setAttribute("duree", duree);
			req.setAttribute("estVue", estVue);
			req.setAttribute("typeFilm", typeFilm);
			this.getServletContext().getRequestDispatcher("/vue/PageFormulaireCreationFilm.jsp").forward(req, resp);
		}
		else {
			Film film = new Film();
			film.setTitre(titre);
			film.setRealisateur(req.getParameter("realisateur"));
			film.setDuree(Integer.valueOf(req.getParameter("duree")));
			film.setEstVu(Boolean.valueOf(req.getParameter("estVue")));
			film.setTypeFilm(typeFilm);
			req.setAttribute("film", film);
			this.getServletContext().getRequestDispatcher("/vue/AffichegeFilm.jsp").forward(req, resp);
		}

	}

}
