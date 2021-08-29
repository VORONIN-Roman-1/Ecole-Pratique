package entity;

public class SacAMain extends Sac {
	
	// Propriété
	protected float prix;
	
	public SacAMain(int volume, String matiere, String couleur, float prix) {
		super(volume, matiere, couleur);
		this.prix = prix;
		
		System.out.println("J'ai fini avec le contructeur fille");
	}



	public SacAMain() {
		// Sous-entend l'instruction
		// super();
	}
	
	public float getPrix() {
		return prix;
		// ou
		// return this.prix;
	}
	
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	public void decorer() {
		System.out.println("Je rends jolie la personne qui me porte." + volume);
	}
}
