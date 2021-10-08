package com.tld;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateVoitureDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Voiture.class)
				.addAnnotatedClass(Moteur.class).addAnnotatedClass(Intervention.class).buildSessionFactory();
		// déclarer session
		Session session = null;
		try {
			// récupérer une session & ouvrir une transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			// récupérer une session & ouvrir une transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			// créer des objets
			Voiture v = new Voiture("clio", "444-ddd-44");
			Moteur m = new Moteur(115, "diesel", 1400);
			// associer les objets
			v.setMoteur(m);
			// récupérer une session & ouvrir une transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			// sauvegarder la voiture
			System.out.println("voiture : " + v);
			session.save(v);
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Terminé !");
		} finally {
			factory.close();
		}
	}

}
