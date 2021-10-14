package com.test.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Employe;

@RestController
@RequestMapping("/api")
public class MainController {
	private List<Employe> employes;
	// définir le PostConstruct pour charger les données des Employes
	@PostConstruct
	public void loadDatas() {
	employes = new ArrayList<>();
	employes.add(new Employe("Robert", "Mignana"));
	employes.add(new Employe("Veronique", "Nemours"));
	employes.add(new Employe("Alexandra", "loiseau"));
	}
	@GetMapping("/employes")
	public List<Employe> getEmployes(){
		return employes;
	}
}
