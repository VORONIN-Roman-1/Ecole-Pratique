package entity;

public class Vehicule {
	protected boolean allume;
	protected double vitesse;
	protected double vitesseMax;
	protected String marque;

	public Vehicule(double vitesseMax, String marque) {
		this.vitesseMax = vitesseMax;
		this.marque = marque;
	}

	public Vehicule() {
		allume = false;
		vitesse = 0;
		vitesseMax = 0;
	}

	public void accelerer() {
		accelerer(10);
	}

	public void accelerer(double augmentation) {
		if (allume) {
			double vitesseAugm = vitesse + augmentation;
			vitesse = vitesseMax < vitesseAugm ? vitesseMax : vitesseAugm;
		}
	}

	public void freiner(double diminuation) {
		if (allume) {
			double vitesseDim = vitesse - diminuation;
			vitesse = vitesseDim > 0 ? vitesseDim : 0;
		}
	}
	public void  freiner() {
		freiner(10);
	}
	public void allumerLeMoteur() {
		System.out.println("Le moteur est allumé ");
		allume=true;
	}
	public void couperLeMoteur() {
		System.out.println("Le moteur est eteint ");
		allume= false;
	}
	public void affichageDescription() {
		System.out.println("Vitesse Max :" +vitesseMax+ "\nMarque :"+ marque);
	}

	public boolean isAllume() {
		return allume;
	}

	public void setAllume(boolean allume) {
		this.allume = allume;
	}

	public double getVitesse() {
		return vitesse;
	}

	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}

	public double getVitesseMax() {
		return vitesseMax;
	}

	public void setVitesseMax(double vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
	
}
