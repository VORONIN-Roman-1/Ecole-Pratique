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

			if (input == 1) {
				showMenuChoix1();
				for (Classe classe : classes) {
					show(classe.affichageMoyenne());
				}
				show("");
			}

			else if (input == 2) {
				showMenuChoix2();
				for (int i = 0; i < classes.length; i++) {
					show((i + 1) + ") classe " + classes[i].nom);
				}
				show("0) Retour au menu principal");
				int inputMenu2 = Recup.i();
				if (inputMenu2 > 0 && inputMenu2 <= classes.length) {
					show(classes[inputMenu2 - 1].affichage() + "\n");
				}
			}

			else if (input == 3) {
				showMenuChoix3();
				for (Classe classe : classes) {
					for (String etudiant : classe.tableauEtudiants())
						show(etudiant);
				}
				show("");
			}

			else if (input == 4) {
				showMenuChoix4();
				int countMenuChoix4 = 0;
				for (int i = 0; i < classes.length; i++) {
					for (int j = 0; j < classes[i].etudiants.length; j++) {
						countMenuChoix4++;
						show(countMenuChoix4 + ") " + classes[i].etudiants[j].nomPrenom());
					}
				}
				show("0) Retour au menu principal");
				int inputMenu4 = Recup.i();
				countMenuChoix4 = 0;
				for (int i = 0; i < classes.length; i++) {
					for (int j = 0; j < classes[i].etudiants.length; j++) {
						countMenuChoix4++;
						if (inputMenu4 == countMenuChoix4)
							show(classes[i].etudiants[j].affichage());
					}
				}
				show("");
			} else if (input == 5) {
				showMenuChoix5();
				for (Classe classe : classes) {
					show(classe.professeurPrincipal.nomPrenom());
				}
				show("");
			}
		} while (input != 0);

	}

	public static void show(String str) {
		System.out.println(str);
	}

	public static void showMenuPrincipal() {
		System.out.println("Menu Principal");
		System.out.println("--------------");
		System.out.println("1) Afficher les moyennes de chaque classe");
		System.out.println("2) Afficher le détail d'une classe");
		System.out.println("3) Afficher tous les étudiants");
		System.out.println("4) Afficher le détail d'un étudiant");
		System.out.println("5) Afficher tous les professeurs");
		System.out.println("0) Quitter");
	}

	public static void showMenuChoix1() {
		System.out.println("Moyennes de chaque classe");
		System.out.println("-------------------------");
	}

	public static void showMenuChoix2() {
		System.out.println("Afficher le détail d'une classe");
		System.out.println("-------------------------------");
	}

	public static void showMenuChoix3() {
		System.out.println("Tous les étudiants");
		System.out.println("------------------");
	}

	public static void showMenuChoix4() {
		System.out.println("Afficher le détail d'un étudiant");
		System.out.println("--------------------------------");
	}

	public static void showMenuChoix5() {
		System.out.println("Afficher tous les professeurs");
		System.out.println("-----------------------------");
	}

}
