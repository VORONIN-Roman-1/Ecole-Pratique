package com.demo.model;

import java.util.List;

public class Abonne {
	private String prenom;
	private String nom;
	private Integer typeAbonnement;
	private String adresse;
	private List<Film> films;
	private Abonne abonneDuo;
	
	public Abonne(String prenom, String nom, Integer typeAbonnement, String adresse, List<Film> films,
			Abonne abonneDuo) {
		this.prenom = prenom;
		this.nom = nom;
		this.typeAbonnement = typeAbonnement;
		this.adresse = adresse;
		this.films = films;
		this.abonneDuo = abonneDuo;
	}

	public Abonne(String prenom, String nom, int typeAbonnement, String adresse) {
		this.prenom = prenom;
		this.nom = nom;
		this.typeAbonnement = typeAbonnement;
		this.adresse = adresse;
	}
	
	public Abonne(String prenom, String nom, Integer typeAbonnement, String adresse, List<Film> films) {
		this.prenom = prenom;
		this.nom = nom;
		this.typeAbonnement = typeAbonnement;
		this.adresse = adresse;
		this.films = films;
	}
	
	
	public Abonne(String prenom, String nom, String adresse) {
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
	}

	public Abonne() {
	}
	
	public Abonne getAbonneDuo() {
		return abonneDuo;
	}

	public void setAbonneDuo(Abonne abonneDuo) {
		this.abonneDuo = abonneDuo;
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getTypeAbonnement() {
		return typeAbonnement;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setTypeAbonnement(Integer typeAbonnement) {
		this.typeAbonnement = typeAbonnement;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}
	
}
