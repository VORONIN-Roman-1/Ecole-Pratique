package execution;

import action.ActionClasse;
import entity.Classe;
import util.Recup;

public class ExecutionPrincipale {
	public static void main(String[] args) {
		Classe[] classes;
		classes = ActionClasse.initialisationClasse();
		int input;
		do {
			showMenuPrincipal();
			input = Recup.i();
			switch (input) {
			case 1:
				showMenuChoix1();
				for (Classe classe : classes) {
					show(classe.affichageMoyenne());
				}
				showVideLine();
				break;
			case 2:
				showMenuChoix2();
				for (int i = 0; i < classes.length; i++) {
					showOneLine(String.valueOf(i + 1) + ")");
					showClasse();
					show(classes[i].nom);
				}
				showRetour();

				int inputMenu2 = Recup.i();
				if (inputMenu2 > 0 && inputMenu2 <= classes.length) {
					show(classes[inputMenu2 - 1].affichage() + "\n");
				}
				break;
			case 3:
				showMenuChoix3();
				for (Classe classe : classes) {
					for (String etudiant : classe.tableauEtudiants())
						show(etudiant);
				}
				showVideLine();
				break;
			case 4:
				showMenuChoix4();
				int countMenuChoix4 = 0;
				for (int i = 0; i < classes.length; i++) {
					for (int j = 0; j < classes[i].etudiants.length; j++) {
						countMenuChoix4++;
						show(countMenuChoix4 + ") " + classes[i].etudiants[j].nomPrenom());
					}
				}
				showRetour();

				int inputMenu4 = Recup.i();
				countMenuChoix4 = 0;
				for (int i = 0; i < classes.length; i++) {
					for (int j = 0; j < classes[i].etudiants.length; j++) {
						countMenuChoix4++;
						if (inputMenu4 == countMenuChoix4)
							show(classes[i].etudiants[j].affichage());
					}
				}
				showVideLine();
				break;
			case 5:
				showMenuChoix5();
				for (Classe classe : classes) {
					show(classe.professeurPrincipal.nomPrenom());
				}
				showVideLine();
				break;

			}

		} while (input != 0);

	}

	public static void show(String str) {
		showOneLine(str + "\n");
	}

	public static void showOneLine(String str) {
		System.out.print(str);
	}

	public static void showRetour() {
		show("0) Retour au menu principal");
	}

	public static void showClasse() {
		showOneLine(" classe");
	}

	public static void showVideLine() {
		show("");
	}

	public static void showMenuPrincipal() {
		show("Menu Principal");
		show("--------------");
		show("1) Afficher les moyennes de chaque classe");
		show("2) Afficher le détail d'une classe");
		show("3) Afficher tous les étudiants");
		show("4) Afficher le détail d'un étudiant");
		show("5) Afficher tous les professeurs");
		show("0) Quitter");
	}

	public static void showMenuChoix1() {
		show("Moyennes de chaque classe");
		show("-------------------------");
	}

	public static void showMenuChoix2() {
		show("Afficher le détail d'une classe");
		show("-------------------------------");
	}

	public static void showMenuChoix3() {
		show("Tous les étudiants");
		show("------------------");
	}

	public static void showMenuChoix4() {
		show("Afficher le détail d'un étudiant");
		show("--------------------------------");
	}

	public static void showMenuChoix5() {
		show("Afficher tous les professeurs");
		show("-----------------------------");
	}

}
