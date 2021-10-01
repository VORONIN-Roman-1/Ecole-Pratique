package com.tld;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Personnage {
	@NotNull( message="champ obligatoire")
	@Size(min=1, message="nom obligatoire")
	private String nom;
	@Size(max = 19)
	private String prenom;
	private String genre;
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
