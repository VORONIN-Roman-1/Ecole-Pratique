package entity;

public class SacMain extends Sac {
	protected float prix;

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	public void decorer() {
		System.out.println("Je rends jolie la personne qui me porte.");
	}
}
