package demo;

import action.ActionClasse;
import entity.Classe;

public class DemoClasse {
	public static void main(String[] args) {
		String str = ActionClasse.demanderNouvelleClasse().affichage();
		System.out.println(str);
		Classe[] classes = ActionClasse.initialisationClasse();
		for (Classe classe : classes) {
			String e = classe.affichage();
			System.out.println(e);
		}
	}
}
