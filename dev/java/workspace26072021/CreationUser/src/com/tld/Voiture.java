package com.tld;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "voiture")
public class Voiture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	// @Column(name = "modele_name")
	private String modele;
	@Column
	private String immatriculation;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "moteur_id")
	private Moteur moteur;
	@OneToMany(mappedBy = "voiture", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH })
	private List<Intervention> interventions;

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
	// méthode pratique pour les relations bi directionnelles oneToMany
	public void add(Intervention intervention) {
		if (interventions == null) {
			interventions = new ArrayList<>();
		}
		interventions.add(intervention);
		intervention.setVoiture(this);
	}

	public List<Intervention> getInterventions() {
		return interventions;
	}

	public void setInterventions(List<Intervention> interventions) {
		this.interventions = interventions;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

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

	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	@Override
	public String toString() {
		return "Voiture [id=" + id + ", modele=" + modele + ", immat=" + immatriculation + "]";
	}
}
