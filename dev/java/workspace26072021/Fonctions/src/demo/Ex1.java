package demo;

public class Ex1 {
	public static void main (String[] args) {
		
	affichage();
	
	System.out.println(message());
	System.out.println(tripleEntier(3));
	System.out.println(additionEntier(5,9));
	
	}
	
	public static void affichage() {
		System.out.println("Je suis une fonction");
	}
	
	public static String message() {
		return "Je suis une messge";
	}
	
	public static int tripleEntier(int valeur) {
		return valeur * 3;
	}
	public static int additionEntier(int valeur, int autreValeur) {
		return valeur + autreValeur;
	}
}
