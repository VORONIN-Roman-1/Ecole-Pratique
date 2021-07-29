package priseEnMain.premier;

public class EchelleDeRichter {
	public static void main (String[] args) {

		int niveau=6;
		String affiche;
		
		switch(niveau) {
			case 1: affiche ="Micro tremblement de terre, non ressenti"  ;
				break;
			
			case 2: affiche ="Très mineur. Non ressenti mais détecté"  ;
				break;
			
			case 3: affiche ="Mineur. Causant rarement des dommages"  ;
				break;
				
			case 4: affiche ="Léger. Secousses notables d’objets à l’intérieur des maisons"  ;
				break;
				
			case 5: affiche ="Modéré. Légers dommages aux édifices bien construits"  ;
				break;
				
			case 6: affiche ="Fort. Destructeur dans des zones allant jusqu’à 180 kilomètres à la ronde si elles sont peuplées"  ;
				break;
				
			case 7: affiche ="Majeur. Dommages modérés à sévères dans des zones plus vastes."  ;
				break;
				
			case 8: affiche ="Important. Dommages sérieux dans des zones à des centaines de kilomètres à la ronde"  ;
				break;
				
			case 9: affiche ="Dévastateur. Dévaste des zones sur des milliers de kilomètres à la ronde"  ;
				break;
				
			default: 
				if (niveau<1) affiche="erreur de saisie";
				else affiche= "l’apocalypse";
		}
		System.out.println(affiche);
	}
}
