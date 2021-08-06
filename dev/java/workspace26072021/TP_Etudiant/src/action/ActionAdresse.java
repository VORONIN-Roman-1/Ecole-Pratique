package action;

import entity.Adresse;
import util.Recup;

public class ActionAdresse {
	public static Adresse demanderNouvelleAdresse() {
		
		System.out.println("numeroVoie, SVP");
		int numeroVoie = Recup.i();
		System.out.println("typeVoie, SVP");
		String typeVoie = Recup.s();
		System.out.println("nomVoie, SVP");
		String nomVoie = Recup.s();
		System.out.println("codePostale, SVP");
		String codePostale = Recup.s();
		System.out.println("ville, SVP");
		String ville = Recup.s();

		
		return new Adresse(numeroVoie,typeVoie,nomVoie,codePostale,ville);
	}
	public static Adresse[] initialisationAdresses() {
		return  new Adresse[]{
				new Adresse (35, "Avenue", "Gloire", "13100", "Aix en Provence"),
				new Adresse (56, "Rue", "Gloire", "13001", "Marseille"),
				new Adresse (22, "Allée", "de Provence", "04100", "Manosque"),
				new Adresse (88, "Rue", "du Grand Saint-Jean", "34000", "Montpellier"),
				new Adresse (11, "Rue", "de la République", "84000", "Avignon"),
		};
	}
}
