package demo;

import action.ActionProfesseur;
import entity.Professeur;

public class DemoProfesseur {
	public static void main (String [] args) {
		String str = ActionProfesseur.demanderNouveauProfesseur().affichage();
		System.out.println(str);
		Professeur[] professeurs = ActionProfesseur.initialisationProfesseur();
		for (Professeur professeur: professeurs) {
			String e= professeur.affichage();
			System.out.println(e);
		}
	}
}
