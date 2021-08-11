package action;

import entity.Adresse;
import entity.Etudiant;
import util.Recup;

public class ActionEtudiant {
	public static Etudiant demanderNouvelEtudiant() {
		System.out.println("nom, SVP");
		String nom = Recup.s();
		System.out.println("prenom, SVP");
		String prenom = Recup.s();
		System.out.println("adresse");
		Adresse adresse = ActionAdresse.demanderNouvelleAdresse();
		System.out.println("note 1, SVP");
		float note1 = Recup.reel();
		System.out.println("note 2, SVP");
		float note2 = Recup.reel();
		System.out.println("note 3, SVP");
		float note3 = Recup.reel();
		float[] notes = new float[] { note1, note2, note3 };
		return new Etudiant(nom, prenom, adresse, notes);
	}

	public static Etudiant[] initialisationEtudiants() {
		Adresse[] adresses = ActionAdresse.initialisationAdresses();
		return new Etudiant[] { new Etudiant("Audiard", "Jean-Paul", adresses[0], new float[] { 1.2f, 3.5f, 6f }),
				new Etudiant("Lanoux", "Emmanuelle", adresses[1], new float[] { 7.8f, 9.4f, 2f }),
				new Etudiant("Belmondo", "Victor", adresses[2], new float[] { 5.0f, 11.3f, 9f }),
				new Etudiant("Rochefort", "Jacques ", adresses[3], new float[] { 3.2f, 12.8f, 0f }),
				new Etudiant("Riva", "Alexander", adresses[4], new float[] { 9.2f, 7.3f,  9f }),
				new Etudiant("Kristoff", "Jean", adresses[4], new float[] { 9.2f, 7.3f,  9f }),
				new Etudiant("Rondeaux", "Louis", adresses[4], new float[] { 9.2f, 7.3f,  9f }),
				new Etudiant("Perrot", "Claude", adresses[4], new float[] { 9.2f, 7.3f,  9f }),
				new Etudiant("Flickinger", "Alexandre", adresses[4], new float[] { 9.2f, 7.3f,  9f }),
				new Etudiant("Rogers", "Guillaume", adresses[4], new float[] { 9.2f, 7.3f,  9f }),
				new Etudiant("Trousselier", "Octave", adresses[4], new float[] { 9.2f, 7.3f,  9f }),
				new Etudiant("Vinokourov", "Roger", adresses[4], new float[] { 9.2f, 7.3f,  9f }),
				new Etudiant("Lapize", "Andy", adresses[4], new float[] { 9.2f, 7.3f,  9f }),
				new Etudiant("Sagan", "Michael", adresses[4], new float[] { 9.2f, 7.3f, 9f }),
				new Etudiant("Chapperon", "Peter", adresses[4], new float[] { 9.2f, 7.3f, 9f }) };
	}
}
