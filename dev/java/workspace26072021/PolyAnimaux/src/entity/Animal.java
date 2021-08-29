package entity;

public class Animal {
	
	protected String nom;
	
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void manger() {
		System.out.println("Je mange normalement");
	}
	
	public void manger(String nourriture) {
		System.out.println("J'aime manger " + nourriture);
	}
	
	public void crier() {
		System.out.println("Je crie");
	}
	
	public void presentation() {
		System.out.println("Bonjour, je m'appelle " + nom);
	}
}
