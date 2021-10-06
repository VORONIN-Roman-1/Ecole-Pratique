package com.tld;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "voiture")
public class Voiture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "modele_name")
	private String modele;
	private String immatriculation;

	public Voiture(Long id, String modele, String immatriculation) {
		this.id = id;
		this.modele = modele;
		this.immatriculation = immatriculation;
	}

	public Voiture() {
	}

	public Voiture(String modele, String immatriculation) {
		this.modele = modele;
		this.immatriculation = immatriculation;
	}

//getters & setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getImmat() {
		return immatriculation;
	}

	public void setImmat(String immat) {
		this.immatriculation = immat;
	}

	@Override
	public String toString() {
		return "Voiture [id=" + id + ", modele=" + modele + ", immat=" + immatriculation + "]";
	}
}
