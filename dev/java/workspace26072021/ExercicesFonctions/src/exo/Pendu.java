package exo;

import util.Recup;

public class Pendu {
	public static void main (String[] args) {
		int countEs=0;
		char[] lettresMot;
		int length=0;
		
		do {
			System.out.println("Un mot scret de moins de 10 lettres, stp");
			String str= Recup.s();
		    lettresMot= str.toCharArray();
			length =lettresMot.length;
		} while (length<10);
		for(int i=0; i<50; i++) {
			System.out.println();
		}
		int countLettreReussi=0;
		char[] motFinal = new char[length];
		for(int i=0; i<length; i++) {
			motFinal[i]= '_'; 
		}
		while(countEs!=11 && countLettreReussi!=length) {
			
	 		System.out.println("essais ratés : "+ countEs);
			System.out.println("Propose un lettre");
			afficherMot(motFinal);

			char ch= Recup.c();
			boolean essaiReussi= false;
			for(int i=0; i<length; i++) {
				if (lettresMot[i] == ch && motFinal[i]!=ch) {
					essaiReussi = true;
					motFinal[i] = ch;
					countLettreReussi++;
				}
			}
			if (!essaiReussi) countEs++;
			
		}
		
		if (countEs==11) System.out.println("Pendu");
		if (countLettreReussi==length) System.out.print("BRAVO!!!");
		//afficherMot(lettresMot);
		//afficherMot(motFinal);
	}
	public static void afficherMot (char [] chs) {
		for(char i:chs) System.out.print(i+" ");
		System.out.println();
	}
}

/*Le principe est le suivant :
Un premier joueur choisit un mot de moins de 10 lettres.
Le programme affiche _ _ _ _ _ _ _ _ _ ( un _ par lettre.)
Le deuxième joueur propose des lettres jusqu'à ce qu'il ait trouvé le mot ou qu'il soit pendu (11 erreurs
commises).
A chaque proposition, le programme affiche le mot avec les lettres découvertes ainsi que les lettres
déjà annoncées et le nombre d'erreurs.
Challenge : Essayer de faire un dessin du pendu aussi*/