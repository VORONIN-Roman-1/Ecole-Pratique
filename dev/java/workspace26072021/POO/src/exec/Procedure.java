package exec;

import entity.Carre;
import entity.Chien;
import entity.Compte;
import entity.Etudiant;
import entity.Rectangle;
import util.Recup;

public class Procedure {
	
	public static void main (String[] ergs) {
		/*Rectangle rectangle = new Rectangle();
		rectangle.setLargeur(5.0);
		rectangle.setHauteur(7.0);
		System.out.println("La surface du rectangle est : "+ rectangle.surface());
		Rectangle rectangle2 = new Rectangle(6, 7);
		System.out.println("La surface du rectangle2 est : "+ rectangle2.surface());
		Carre carre1 = new Carre();
		carre1.setLargeur(4.0);
		System.out.println("La surface du carre1 est : "+ carre1.surface());
		
		Carre carre2 = new Carre();
		carre2.setLargeur(12.5);
		System.out.println("La surface du carre2 est : "+ carre2.surface());
		*/
		
		Chien chien1 = new Chien ("Medor","marron","3");
		Chien chien2 = new Chien ("Lassie","rousse","5");
		Chien chien3 = new Chien ("Milou","clair","4");
		
		chien1.affichage();
		chien2.affichage();
		chien3.affichage();
		
		chien1.aboie();
		chien2.aboie();
		chien3.aboie();
		
		Compte compte= new Compte(1000, "Ivan");
		compte.afficher();
		compte.depot(200);
		compte.afficher();
		compte.retrait(300);
		compte.afficher();
		System.out.println("Number etudiants?");
		int count = Recup.i();
		Etudiant[] etudiants= new Etudiant[count];
		int i=0;
		while(i<count) {
			System.out.println("Votre nom");
			String nom=Recup.s();
			System.out.println("Votre note1");
			int note1 = Recup.i();
			System.out.println("Votre note2");
			int note2 = Recup.i();
			Etudiant etudiant = new Etudiant(nom, note1, note2);
			//etudiant.show();
			etudiants[i]= etudiant;
		}
		for (Etudiant etudiant:etudiants) {
			etudiant.show();
		}
	}

}
