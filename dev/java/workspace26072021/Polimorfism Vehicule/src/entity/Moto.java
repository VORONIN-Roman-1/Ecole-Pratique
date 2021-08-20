package entity;

public class Moto extends Vehicule {
	private int nbRoues;
	private int cylindrees;
	public Moto(double vitesseMax, String marque, int cylindrees) {
		super(vitesseMax, marque);
		this.cylindrees = cylindrees;
		nbRoues=2;
	}
	public Moto() {
		super();
		nbRoues=2;
	}
	public void accelerer() {
		super.accelerer(20);
	}
	public void  freiner() {
		super.freiner(20);
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
		System.out.println("Cylindrees: "+cylindrees);
	}

}
