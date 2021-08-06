package demo;


import action.ActionEtudiant;
import entity.Etudiant;

public class DemoEtudiant {
	public static void main (String [] args) {
		String str = ActionEtudiant.demanderNouvelEtudiant().affichage();
		System.out.println(str);
		Etudiant[] etudiants = ActionEtudiant.initialisationEtudiants();
		for (Etudiant etudiant: etudiants) {
			String e= etudiant.affichage();
			System.out.println(e);
		}
	}
}
