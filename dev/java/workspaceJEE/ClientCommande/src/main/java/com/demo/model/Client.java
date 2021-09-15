package com.demo.model;

import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private int age;
	private List<String> adresse;

	public Client() {
	}

	public Client(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	

	public Client(String nom, String prenom, int age, List<String> adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
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

	public List<String> getAdresse() {
		return adresse;
	}

	public void setAdresse(List<String> adresse) {
		this.adresse = adresse;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
