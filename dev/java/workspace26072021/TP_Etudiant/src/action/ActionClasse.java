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
		Etudiant[] etudiants = new Etudiant[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Etudiant № " + (i + 1));
			etudiants[i] = ActionEtudiant.demanderNouvelEtudiant();
		}
		Classe classe = new Classe();
		classe.nom = nom;
		classe.professeurPrincipal = prof;
		classe.etudiants = etudiants;
		return classe;
	}

	public static Classe[] initialisationClasse() {
		Professeur[] professeurs = ActionProfesseur.initialisationProfesseur();
		Etudiant[] etudiants = ActionEtudiant.initialisationEtudiants();

		Classe classe1 = new Classe();
		classe1.nom = "3ème1";
		classe1.professeurPrincipal = professeurs[0];
		classe1.etudiants = new Etudiant[] { etudiants[0], etudiants[1], etudiants[2], etudiants[3], etudiants[4] };

		Classe classe2 = new Classe();
		classe2.nom = "4ème2";
		classe2.professeurPrincipal = professeurs[1];
		classe2.etudiants = new Etudiant[] { etudiants[5], etudiants[6], etudiants[7], etudiants[8], etudiants[9] };

		Classe classe3 = new Classe();
		classe3.nom = "5ème3";
		classe3.professeurPrincipal = professeurs[2];
		classe3.etudiants = new Etudiant[] { etudiants[10], etudiants[11], etudiants[12], etudiants[13],
				etudiants[14] };

		/*
		 * return new Classe[] {new Classe("3ème1", professeurs[0], etudiants ), new
		 * Classe("4ème2", professeurs[1], etudiants ), new Classe("5ème3",
		 * professeurs[2], etudiants ), };
		 */
		return new Classe[] { classe1, classe2, classe3 };
	}
}
