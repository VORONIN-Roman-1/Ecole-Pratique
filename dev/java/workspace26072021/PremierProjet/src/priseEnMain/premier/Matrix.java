package priseEnMain.premier;

import util.Recup;

public class Matrix {
	public static void main (String[] args) {
		int compteurLine=0;
		int compteurColonne=0;
		char ch='a';
		
		System.out.println("Donne moi le chiffre");
		int dimensionDeFigure= Recup.entier();
		
		while (compteurLine<=dimensionDeFigure) {
			compteurColonne=0;
			while (compteurColonne<=dimensionDeFigure) {
				if (compteurColonne>=compteurLine)
					if (compteurLine>=10) 
						System.out.print((char)(ch-10+compteurLine));
					else
					System.out.print(compteurLine);
				else 
					System.out.print(" ");
				compteurColonne=compteurColonne+1;
			}
			System.out.println();
			compteurLine=compteurLine+1;
		}
		// XOOXOXOXO
		int line=0;
		int colonne=0;
		
		System.out.println("Donne moi le chiffre");
		dimensionDeFigure= Recup.entier();
		
		while (line<dimensionDeFigure) {
			colonne=0;
			while (colonne<dimensionDeFigure) {
				if (colonne==line || colonne==0 || line==dimensionDeFigure-1)
					System.out.print("X");
				else if (line>colonne) 
					System.out.print("O");
				colonne=colonne+1;
			}
			System.out.println();
			line=line+1;
		}
		
		
		System.out.print("Donnez un entier : ");
		int answer = Recup.entier();
		
		for (int x = 0; x < answer; x++ ) {
			
			for ( int z = 0; z < x; z++) {
				System.out.print(" ");
				
			}
			for (int y = answer; y > 1; y--) {
				
				if (y > (x + 1)) {
					System.out.print(Integer.toHexString(x).toUpperCase());					
				}
				
			}
		
			System.out.println(Integer.toHexString(x).toUpperCase());
			
		}
	}

}
