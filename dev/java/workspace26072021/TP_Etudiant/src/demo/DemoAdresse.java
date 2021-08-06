package demo;

import action.ActionAdresse;
import entity.Adresse;

public class DemoAdresse {
	public static void main (String [] args) {
		
		String str= ActionAdresse.demanderNouvelleAdresse().getAdressePostale();
		System.out.println(str);
		Adresse[] adresses = ActionAdresse.initialisationAdresses();
		for (Adresse adresse: adresses) {
			String s= adresse.getAdressePostale();
			System.out.println(s);
		}
	}
}
