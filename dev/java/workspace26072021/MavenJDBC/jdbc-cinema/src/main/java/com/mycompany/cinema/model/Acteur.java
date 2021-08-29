package com.mycompany.cinema.model;

public class Acteur {
	private int id;
	private String nom;
	private String prenom;
	
	
	public Acteur() {
	}
	
	public Acteur(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+ this.getNom() +" Prenom: "+ this.getPrenom() +" ID: "+ this.getId();
	}
	
}
