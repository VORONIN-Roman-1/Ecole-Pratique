package entity;

public class Carre {
	private double largeur;

	public Carre(double largeur) {

		this.largeur = largeur;
	}

	public Carre() {

	}
	public double surface() {
		return largeur*largeur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
}
