package com.mvcdemo.controller;

import java.util.List;

public class Utilisateur {
	private String nom;
	private String prenom;
	private String pays;
	
	//private List<String> listDePays;
	
	public Utilisateur() {
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
