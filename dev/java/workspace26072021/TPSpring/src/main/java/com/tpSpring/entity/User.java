package com.tpSpring.entity;

import javax.persistence.Entity;

@Entity
public class User {
	private Long id;
	private String prenom;
	private String nom;
	private String email;
}
