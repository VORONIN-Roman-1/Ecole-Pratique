package com.example.demoThymeleaf.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
public class Formation {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private LocalDate dateDebut;
private LocalDate dateFin;
private String intitule;
private String niveauEtude;
public Formation(String name, LocalDate dateDebut, LocalDate dateFin, String intitule, String niveauEtude) {
	this.name = name;
	this.dateDebut = dateDebut;
	this.dateFin = dateFin;
	this.intitule = intitule;
	this.niveauEtude = niveauEtude;
}


}
