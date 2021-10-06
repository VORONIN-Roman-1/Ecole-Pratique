package com.tld;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DemoApp {
	public static void main(String[] args) {

// create session factory
		SessionFactory factory = new Configuration().configure("hibernate-cfg.xml").addAnnotatedClass(Voiture.class)
				.buildSessionFactory();
// create session
		Session session = factory.getCurrentSession();
//		try {
//			//Voiture voitureTemp2= new Voiture(44L, "clio", "AK-47");
//			Voiture voitureTemp= new Voiture("clio", "AK-725-66");
//
//			 
//			// debut de trasaction
//			session.beginTransaction();
//			// save la voiture
//			session.save(voitureTemp);
//			//session.save(voitureTemp2);
//			// commit de la transaction
//			session.getTransaction().commit();
//		} finally {
//			factory.close();
//		}
		try {
			Voiture voitureTemp1= new Voiture("picasso", "CDF-548-13");
			Voiture voitureTemp2= new Voiture("countach", "ZE-022-13");
			Voiture voitureTemp3= new Voiture("kangoo", "Zg-047-84");
			// debut de trasaction
			session.beginTransaction();
			// save la voiture
			session.save(voitureTemp1);
			session.save(voitureTemp2);
			session.save(voitureTemp3);
			// commit de la transaction
			 session.getTransaction().commit();
		 
			 //trouver l'id de la voiture que l'on vient de stocker en base
			 System.out.println("voiture sauvegardée . son id généré: "+voitureTemp3.getId());
			 
			 //récupérer une nouvelle session et ouvrir une transaction 
			 session = factory.getCurrentSession();
			 session.beginTransaction();
			 
			 //lire ou récupérer une voiture avec son id: clé primaire
			 System.out.println("\nRecupérer la voiture avec l'id : "+voitureTemp3.getId());
			 Voiture voitureSaved = session.get(Voiture.class, voitureTemp3.getId());
			 System.out.println("Get Terminé : "+voitureSaved);
			 
			//commit transaction
			 session.getTransaction().commit();
			 
			 System.out.println("Terminé !");
			} finally {
			factory.close();
			}

	}
}
