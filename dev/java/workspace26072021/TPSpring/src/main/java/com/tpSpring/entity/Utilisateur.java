package com.tpSpring.entity;

import javax.persistence.Entity;

@Entity
public class Utilisateur {
	private Long id;
	private String prenom;
	private String nom;
	private String email;
}
