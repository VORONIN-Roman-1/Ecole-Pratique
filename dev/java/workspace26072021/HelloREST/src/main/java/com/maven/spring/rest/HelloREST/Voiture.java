package com.maven.spring.rest.HelloREST;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown= true)
public class Voiture {
	private Moteur moteur;
	private Date dateCreation;
	private int vitesseMax;
	private String marque;
	private char modele;
	private double [ ] gabarite;
	private List<String> Usines;
	
	public Moteur getMoteur() {
		return moteur;
	}
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public int getVitesseMax() {
		return vitesseMax;
	}
	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public char getModele() {
		return modele;
	}
	public void setModele(char modele) {
		this.modele = modele;
	}
	public double[] getGabarite() {
		return gabarite;
	}
	public void setGabarite(double[] gabarite) {
		this.gabarite = gabarite;
	}
	public List<String> getUsines() {
		return Usines;
	}
	public void setUsines(List<String> usines) {
		Usines = usines;
	}
	
	
}
