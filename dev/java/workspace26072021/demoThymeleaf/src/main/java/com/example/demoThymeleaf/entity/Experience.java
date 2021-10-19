package com.example.demoThymeleaf.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Experience {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String entrepriseName;
private LocalDate dateDebut;
private LocalDate dateFin;
private String role;
public Experience(String entrepriseName, LocalDate dateDebut, LocalDate dateFin, String role) {
	this.entrepriseName = entrepriseName;
	this.dateDebut = dateDebut;
	this.dateFin = dateFin;
	this.role = role;
}


}
