package action;

import entity.Classe;
import entity.Etudiant;
import entity.Professeur;
import util.Recup;


public class ActionClasse {
	public static Classe demanderNouvelleClasse() {
		System.out.println("nom de la classe, SVP");
		String nom = Recup.s();
		System.out.println("Professeur");
		Professeur prof = ActionProfesseur.demanderNouveauProfesseur(); 
		Etudiant[] etudiants= new Etudiant[5];
		for (int i=0; i<5; i++){
			System.out.println("Etudiant № " + (i+1));
			etudiants[i] = ActionEtudiant.demanderNouvelEtudiant(); 
		}
		return new Classe (nom, prof, etudiants);
	} 
	public static Classe[] initialisationClasse() {
		Professeur[] professeurs = ActionProfesseur.initialisationProfesseur();
		Etudiant[] etudiants = ActionEtudiant.initialisationEtudiants();
		return new Classe[] {new Classe("3ème1", professeurs[0], etudiants ),
				new Classe("4ème2", professeurs[1], etudiants ),
				new Classe("3ème1", professeurs[2], etudiants ),
				};
	}
}

