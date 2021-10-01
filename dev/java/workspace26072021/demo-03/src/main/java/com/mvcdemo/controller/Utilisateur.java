package com.mvcdemo.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Utilisateur {
	private String prenom;
	private String nom;
	private String pays;
	
	private Map<String, String>  paysListe;
	
	public Utilisateur() {
		paysListe=  new HashMap<>();

		paysListe.put("BR", "Brésil");
		paysListe.put("FR", "France");
		paysListe.put("DE", "Allemagne");
		paysListe.put("IN", "Inde");
		paysListe.put("US", "Etats Unis");
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
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
	public Map<String, String> getPaysListe() {
		return paysListe;
	}
	public void setPaysListe(HashMap<String, String> paysListe) {
		this.paysListe = paysListe;
	}
	
}
