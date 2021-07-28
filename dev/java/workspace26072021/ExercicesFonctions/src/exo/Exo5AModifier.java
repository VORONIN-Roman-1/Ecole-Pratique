package exo;

public class Exo5AModifier {

	
	public static void main(String[] args) {
		
		// Variables
		String nom1 = "Florent";
		String nom2 = "Yasmine";
		int nbCerisesFlorent = 9;
		int nbCerisesYasmine = 7;
		
		manger(nom1,nbCerisesFlorent,1);
		manger(nom2,nbCerisesYasmine,3);
		
	}
	public static void manger(String name, int number, int enMange) {
		System.out.println(name+" a cueilli " + number + " cerises");
		System.out.println(name + " en mange "+ enMange);
		number-=enMange;
		System.out.println("ça fait maintenant " + number + " cerises");

	}
}
