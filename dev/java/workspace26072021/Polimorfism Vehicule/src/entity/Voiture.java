package entity;

public class Voiture extends Vehicule {
	private int nbRoues;
	private int nbChevaux;

	public Voiture() {
		super();
		nbRoues = 4;
	}

	public Voiture(double vitesseMax, String marque, int nbChevaux) {
		super(vitesseMax, marque);
		this.nbChevaux = nbChevaux;
	}

	public void accelerer() {
		super.accelerer(30);
	}

	public void freiner() {
		super.freiner(30);
	}
	public void allumerLeMoteur() {
		super.allumerLeMoteur();
		System.out.println("La clé été insérée ");
	}
	public void couperLeMoteur() {
		super.couperLeMoteur();
		System.out.println("« La clé été retirée ");
	}
	public void affichageDescription() {
		super.affichageDescription();
		System.out.println("Chevaux: "+nbChevaux);
	}


}
