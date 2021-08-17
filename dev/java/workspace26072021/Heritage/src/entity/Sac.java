package entity;

public class Sac {

	protected int volume;
	protected String matiere;
	protected String couleur;

	public int getVolume() {
		return volume;
	}

	public String getMatiere() {
		return matiere;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void contenir() {
		System.out.println("Je peux contenir, je gère");
	}
}
