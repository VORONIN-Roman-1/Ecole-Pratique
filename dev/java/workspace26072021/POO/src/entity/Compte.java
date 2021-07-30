package entity;

public class Compte {
	public double solde;
	public String titulaire;
	
	public Compte(double solde, String titulaire) {
		this.solde = solde;
		this.titulaire = titulaire;
	}
	public void  depot (double depot) {
		solde+=depot;
	}
	public void retrait (double retrait) {
		solde-=retrait;
	}
	public void afficher() {
		System.out.println("Compte de " + titulaire + ", solde: "+ solde);
	}

}
