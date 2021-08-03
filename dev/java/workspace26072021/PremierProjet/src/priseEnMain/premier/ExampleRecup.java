package priseEnMain.premier;

import util.Recup;

public class ExampleRecup {
	public static void main (String[] args) {
		int n=1;
		int somme=0;
		while(n!=0) {
			System.out.println("Entrer un entier (0 pour arreter):");
			n=Recup.i();
			somme=somme+n;
		}
		System.out.println("La somme est "+ somme);
	}
}
