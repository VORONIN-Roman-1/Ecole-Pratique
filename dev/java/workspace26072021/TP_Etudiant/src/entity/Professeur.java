package entity;

public class Professeur {
	private String nom;
	private String prenom;
	private String matiere;

	public Professeur(String nom, String prenom, String matiere) {
		this.nom = nom;
		this.prenom = prenom;
		this.matiere = matiere;
	}

	public Professeur() {
	}

	public String nomPrenom() {
		return nom + " " + prenom;
	}

	public String affichage() {
		return nomPrenom() + " ; matière : " + matiere;
	}
}
