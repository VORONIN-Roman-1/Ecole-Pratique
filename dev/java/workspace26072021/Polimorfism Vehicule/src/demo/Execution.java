package demo;

import java.util.ArrayList;
import java.util.List;

import entity.Moto;
import entity.Voiture;
import entity.Vehicule;

public class Execution {

	public static void main(String[] args) {

		//Moto moto1= new Moto();
		Moto moto2= new Moto(200, "Honda", 300);
		//Voiture voiture1= new Voiture();
		Voiture voiture2= new Voiture(150, "Renault", 70 );
		
		
		List <Vehicule> vehicules = new ArrayList<>();
		//vehicules.add(voiture1);
		vehicules.add(voiture2);
		//vehicules.add(moto1);
		vehicules.add(moto2);
		for (Vehicule vehicule : vehicules ) {
		System.out.println("Description ---------------------- ");
		System.out.println("");
		vehicule.affichageDescription();
		
		System.out.println("Allumer le moteur  et accelerer ------------");
		System.out.println("");
		vehicule.allumerLeMoteur();
		vehicule.accelerer();
		vehicule.accelerer();
		System.out.println("isAllume: "+ vehicule.isAllume());
		System.out.println("Vitesse: "+vehicule.getVitesse());
		System.out.println("Freiner------------");
		System.out.println("");
		vehicule.freiner(20);
		System.out.println("Vitesse: "+vehicule.getVitesse());
		vehicule.couperLeMoteur();
		System.out.println("CouperLeMoteur------------");
		System.out.println("");
		System.out.println("isAllume: "+ vehicule.isAllume());
		System.out.println("Vitesse: "+vehicule.getVitesse());
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		}
	}

}
