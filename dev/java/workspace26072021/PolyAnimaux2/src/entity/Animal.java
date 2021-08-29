package entity;

public class Animal {
	
	public static int count=0;
	
	protected String nom;
	
	
	public Animal() {
		count++;
	}

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
