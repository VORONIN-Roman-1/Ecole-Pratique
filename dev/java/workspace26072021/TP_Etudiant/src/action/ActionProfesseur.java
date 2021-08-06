package action;

import entity.Professeur;
import util.Recup;

public class ActionProfesseur {
	public static Professeur demanderNouveauProfesseur() {
		System.out.println("nom, SVP");
		String nom = Recup.s();
		System.out.println("prenom, SVP");
		String prenom = Recup.s();
		System.out.println("matiere");
		String matiere = Recup.s();
		return new Professeur(nom, prenom, matiere);
	}

	public static Professeur[] initialisationProfesseur() {
		return new Professeur[] { new Professeur("Langevin", "Roger", "Mathématiques"),
				new Professeur("Einstein", "Paul", "Géographie"), new Professeur("Chartier", "Albert", "Chimie"), };
	}

}
