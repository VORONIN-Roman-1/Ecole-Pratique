package entity;

public class Sac {
	
	// Proprietes
	protected int volume;
	protected String matiere;
	protected String couleur;
	
	// Constructeur
	public Sac(int volume, String matiere, String couleur) {
		System.out.println("Je suis dans le constructeur mère");
		setVolume(volume);
		setMatiere(matiere);
		setCouleur(couleur);
		
		// ou
//		this.volume = volume;
//		this.matiere = matiere;
//		this.couleur = couleur;
	}
	
	// Constructeur par defaut
	public Sac() {
		volume = 0;
	}
	
	
	// Getters
	public int getVolume() {
		// return volume;
		// ou
		return this.volume;
	}
	
	public String getMatiere() {
		return matiere;
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	
	// Setters
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
	// Méthodes
	public void contenir() {
		System.out.println("Je peux contenir, je gère");
	}
}
