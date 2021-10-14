package com.test.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/employes/{id}")
	public Employe getEmploye(@PathVariable(name = "id") int employeId) {
		return employes.get(employeId);
	}

	// définir un end point "/employes" qui sauvegarder un nouvel employe
	@PostMapping("/employes")
	public Employe addEmploye(@RequestBody Employe employe) {
	//simuler la bdd
	employe.setId(employes.size());
	employes.add(employe);
	return employe;
	}
	@DeleteMapping("/employes/{id}")
	public Employe deleteEmploye(@PathVariable(name = "id") int employeId) {
	Employe employe=  employes.remove(employeId);
	
	return employe;
	}

}
