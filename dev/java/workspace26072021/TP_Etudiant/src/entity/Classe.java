package entity;

public class Classe {
	public String nom;
	public Professeur professeurPrincipal;
	public Etudiant[] etudiants = new Etudiant[5];
	public Classe() {
	} 
	
	public Classe(String nom, Professeur professeurPrincipal, Etudiant[] etudiants) {
		this.nom = nom;
		this.professeurPrincipal = professeurPrincipal;
		this.etudiants = etudiants;
	}

	public float plusBasseMoyenne() {
		float moyenneMin = etudiants[0].moyenne();
		for (Etudiant etudiant : etudiants) {
			moyenneMin = moyenneMin < etudiant.moyenne()? moyenneMin : etudiant.moyenne();
		}
		return moyenneMin;
	}
	public float plusHauteMoyenne() {
		float moyenneMax = etudiants[0].moyenne();
		for (Etudiant etudiant : etudiants) {
			moyenneMax = moyenneMax > etudiant.moyenne()? moyenneMax : etudiant.moyenne();
		}
		return moyenneMax;
	}
	public float moyenneClasse(){
		float moyenneAverage = 0f;
		for (Etudiant etudiant : etudiants) {
			moyenneAverage += etudiant.moyenne();
		}
		return moyenneAverage/etudiants.length;
	}
	public String affichageMoyenne() {
		return "Class : "+ nom + 
				" ; la moyenne la plus basse : "+ plusBasseMoyenne() +
				" ; la moyenne de la classe : "+ moyenneClasse() +
				" ; la moyenne la plus haute : "+ plusHauteMoyenne(); 
	}
	public String[] tableauEtudiants() {
		String[] etuds = new String[5];
		for (int i=0; i<5; i++) etuds[i] = etudiants[i].nomPrenom();
		return etuds;
	}
	public String affichage() {
		String result = "Class : "+ nom + " ; Professeur : " + professeurPrincipal.affichage()+ " ; Etudiant : ";
		for (Etudiant etudiant : etudiants) {
			result +=  " ; "+etudiant.affichage();
		}
		return result;
	}
}
