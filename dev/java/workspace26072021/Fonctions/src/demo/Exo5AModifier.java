package demo;

public class Exo5AModifier{
	public static void main(String[] args) {
	// Variables
	String nom1 = "Florent";
	String nom2 = "Yasmine";
	
	int nbCerisesFlorent = 9;
	int nbCerisesYasmine = 7;
	
	int ceriseMangerForent = 1;
	int ceriseMangerYasmine = 3;
	
	// on appel la fonction
	afficheTout(nom1, nbCerisesFlorent, ceriseMangerForent);
	afficheTout(nom2, nbCerisesYasmine, ceriseMangerYasmine);

}





public static void afficheTout(String prenom, int nbCeriseRamasse, int nbCeriseManger) {
	System.out.println(prenom + " a cueilli " + nbCeriseRamasse + " cerises");
	System.out.println(prenom + " en mange "+ nbCeriseManger);
	System.out.println("ça fait maintenant " + (nbCeriseRamasse - nbCeriseManger) +  " cerises pour " + prenom);
}
}