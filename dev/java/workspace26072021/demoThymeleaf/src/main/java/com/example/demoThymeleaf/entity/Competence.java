package com.example.demoThymeleaf.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Competence {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private Long id;
private String nom;
private String picture;
private int level;
public Competence(String nom, String picture, int level) {
	this.nom = nom;
	this.picture = picture;
	this.level = level;
}

}
