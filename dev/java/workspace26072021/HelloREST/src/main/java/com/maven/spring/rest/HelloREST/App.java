package com.maven.spring.rest.HelloREST;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Hello World!");
//       

		ObjectMapper objectMapper = new ObjectMapper();
		// lire un fichier contenant un objet Json
		Moteur moteur= new Moteur();
		moteur.setCilindre(400);
		Voiture voiture = new Voiture();
//		voiture.setMoteur(moteur);
//		voiture.setDateCreation(new Date(88, 5, 6));
//		voiture.setVitesseMax(290);
//		voiture.setMarque("Renaut");
//		voiture.setModele('S');
//		voiture.setGabarite(new double[] { 4.5, 3.8, 7.5 });
//		List<String> usine = new ArrayList<>();
//		usine.add("Renaut France");
//		usine.add("Dacia Russie");
//		voiture.setUsines(usine);
//
//		// ecrire json dans un fichier de sortie
//		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
//		objectMapper.writeValue(new File("data/output.json"), voiture);

		// lire un fichier contenant un objet Json
		voiture = objectMapper.readValue(new File("data/output.json"), Voiture.class);
		// on imprime les valeur de l'objet pojo
		System.out.println("getMarque = " + voiture.getMarque());
		System.out.println("getModele = " + voiture.getModele());
		System.out.println("getDateCreation = " + voiture.getDateCreation());
		System.out.println("getDateCreation = " + voiture.getMoteur().getCilindre());
		

		
		// créer l'object Mapper
	}
}
