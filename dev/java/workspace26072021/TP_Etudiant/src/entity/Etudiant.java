package entity;

public class Etudiant {
	public String nom;
	public String prenom;
	public Adresse adresse;
	float notes[] = new float[3];

	public Etudiant(String nom, String prenom, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public Etudiant(String nom, String prenom, Adresse adresse, float[] notes) {
		this(nom, prenom, adresse);
		this.notes = notes;
	}

	public Etudiant() {
	}

	public String nomPrenom() {
		return nom + " " + prenom;
	}

	public float moyenne() {
		return (notes[0] + notes[1] + notes[2]) / 3;
	}

	public String getAdressePostale() {
		return nomPrenom() + " ; Adresse: " + adresse.getAdressePostale();
	}

	public String affichage() {
		return getAdressePostale() + " ; " + "Notes: " + notes[0] + " ; " + notes[1] + " ; " + notes[2]
				+ " ; moyenne = " + moyenne();
	}

}
