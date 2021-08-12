package priseEnMain.premier;

import util.Recup;

public class Spring2 {
	public static void main(String[] args) {

		//////// EX2===============================
		// Récupérer le deuxième mot du String "harder - better - faster -
		// stronger"

		String str = "harder - better - faster - stronger";
		String[] strs = str.split("-");
		System.out.println(strs[1].strip());

		////////// Ex3==========================
		// Ecrire une fonction qui retourne le nombre de mots contenus dans
		// une phrase (qu’on considèrera sans ponctualition)

		System.out.println("=EX3 une phrase, SVP");
		String string = Recup.s();
		String[] strings = string.split(" ");
		System.out.println("Nombre de mots: " + strings.length);

		////////// Ex4==========================
		// Ecrire une fonction qui vérifie si le String en paramètre commence
		// par « str » et finit par « stop »
		System.out.println("=EX4 une phrase qui commence" + "	par « str » et finit par « stop », SVP");
		String phrase = Recup.s();
		if (phrase.startsWith(" str ") && phrase.endsWith(" stop ")) {
			System.out.println("OUI bon");
		} else
			System.out.println("Non");
		////////// Ex5==========================
		// Ecrire une fonction qui divise un String en tableau de String, chacun
		// contenant 10 caractères, sauf le dernier qui contiendra le nombre
		// de caractère restant.

		System.out.println("=EX5 longue phrase , SVP");
		String longPhrase = Recup.s();
		int size = 1 + longPhrase.length() / 10;
		String[] mstr = new String[size];
		for (int i = 0; i < size; i++) {
			if ((i + 1) >= size)
				mstr[i] = longPhrase.substring(i * 10);

			else
				mstr[i] = longPhrase.substring(i * 10, (i + 1) * 10);
		}
		for (String s : mstr) {
			System.out.println(s);
		}
		////////// Ex6==========================
		// Ecrire une fonction qui vérifie qu’un String contient au moins la
		// lettre « a » (qu’importe la case), le chiffre « 0 » et un « . »
		System.out.println("=EX6 la phrase  avec lettre « a » (qu’importe la case), le chiffre « 0 » et un « . », SVP");
		String phraseAO = Recup.s();
		if ((phraseAO.contains("a") || phraseAO.contains("A")) && phraseAO.contains("0")
				&& phraseAO.contains(".")) {
			System.out.println("OUI bon");
		} else
			System.out.println("Non");

	}
}
