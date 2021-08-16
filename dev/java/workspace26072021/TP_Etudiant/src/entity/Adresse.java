package entity;

public class Adresse {
	public int numeroVoie;
	public String typeVoie;
	public String nomVoie;
	public String codePostale;
	public String ville;

	public Adresse(int numeroVoie, String typeVoie, String nomVoie, String codePostale, String ville) {
		this.numeroVoie = numeroVoie;
		this.typeVoie = typeVoie;
		this.nomVoie = nomVoie;
		this.codePostale = codePostale;
		this.ville = ville;
	}

	public Adresse() {
	}

	public String getAdressePostale() {
		return numeroVoie + " " + typeVoie + " " + nomVoie + " " + codePostale + " " + ville;
	}

}
