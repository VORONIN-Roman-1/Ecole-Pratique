package entity;

public class SacAMainLongchamp extends SacAMain {
	private int tailleLogo;
	private String matiereSecondaire;

	public SacAMainLongchamp(int volume, String matiere, String couleur, float prix, int tailleLogo,
			String matiereSecondaire) {
		super(volume, matiere, couleur, prix);
		this.tailleLogo = tailleLogo;
		this.matiereSecondaire = matiereSecondaire;
	}

	public SacAMainLongchamp() {
		super();
	}

	public int getTailleLogo() {
		return tailleLogo;
	}

	public void setTailleLogo(int tailleLogo) {
		this.tailleLogo = tailleLogo;
	}

	public String getMatiereSecondaire() {
		return matiereSecondaire;
	}

	public void setMatiereSecondaire(String matiereSecondaire) {
		this.matiereSecondaire = matiereSecondaire;
	}

	public void augmentationPrix(int multiplicateur) {
		prix *= multiplicateur;
	}
}
