package com.demo.model;

public class Commande {
	private String article;
	private int nombreArticle;
	private double prix;
	public Commande() {
	}
	public Commande(String article, int nombreArticle, double prix) {
		this.article = article;
		this.nombreArticle = nombreArticle;
		this.prix = prix;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public int getNombreArticle() {
		return nombreArticle;
	}
	public void setNombreArticle(int nombreArticle) {
		this.nombreArticle = nombreArticle;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
}
