package exo;

import java.io.Console;
import java.util.Scanner;

//port util.Recup;

public class PenduConsoleLite {
	public static void main (String[] args) {
		int countEs=0;
		char[] lettresMot;
		int length=0;
		Console console = System.console();
        
		do {
			if (console == null) {
				System.out.println("Un mot secret de moins de 10 lettres, stp");
				String str= Recup.s();
			    lettresMot= str.toCharArray();
			}
			else {
				lettresMot= console.readPassword("Un mot secret (ne pas afficher en console) de moins de 10 lettres, stp: ");
			}
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
		while(countEs!=12 && countLettreReussi!=length) {
			
	 		System.out.println("essais : "+ (countEs+1)+"//12");
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
		
		if (countEs==12) System.out.println("Pendu");
		if (countLettreReussi==length) System.out.print("BRAVO!!!");
		afficherMot(lettresMot);
		//afficherMot(motFinal);
	}
	public static void afficherMot (char [] chs) {
		for(char i:chs) System.out.print(i+" ");
		System.out.println();
	}
}


class Recup {
	
	private static Scanner sc = new Scanner(System.in);
	
	// Lecture d'une chaine terminee par un "RETURN" 
	public static String chaine() {
		String result = sc.nextLine();
		return result;
	}
	
	// Lecture d'un caractere : uniquement le premier caractere de la nouvelle ligne
	public static char caractere () {
		char result = 0;
		try {
			String chaine = chaine();
			result = chaine.charAt(0);
		}
		catch (Exception e) {
			System.out.println("La saisie est invalide");
			System.exit(0);
		}
		return result;
	}

	public static int entier ()	{	
		int result = 0;
		try {
			result = sc.nextInt();
			if(sc.hasNextLine()) sc.nextLine();
		}
		catch (Exception e) {
			System.out.println("La saisie est invalide");
			System.exit(0);
		}
		return result;
	}
	
	public static short entierCourt ()	{	
		short result = 0;		
		try {
			result = sc.nextShort();
			if(sc.hasNextLine()) sc.nextLine();
		} catch (Exception e) {
			System.out.println("La saisie est invalide");
			System.exit(0);
		}
		return result;
	}
	
	public static long entierLong ()	{		
		long result = 0;
		try {
			result = sc.nextLong();
			if(sc.hasNextLine()) sc.nextLine();
		} catch (Exception e) {
			System.out.println("La saisie est invalide");
			System.exit(0);
		}
		return result;
	}
	public static float reel ()	{		
		float result = 0;
		try {
			result = sc.nextFloat();
			if(sc.hasNextLine()) sc.nextLine();
		} catch (Exception e) {
			System.out.println("La saisie est invalide");
			System.exit(0);
		}
		return result;
	}
	public static double decimal ()	{		
		double result = 0;
		try {
			result = sc.nextDouble();
			if(sc.hasNextLine()) sc.nextLine();
		} catch (Exception e) {
			System.out.println("La saisie est invalide");
			System.exit(0);
		}
		return result;
	}

	// alias 
	public static String 	s() { return chaine(); };
	public static char 		c() { return caractere(); };
	public static int 		i() { return entier(); };
	public static double	d() { return decimal(); };
}
	
