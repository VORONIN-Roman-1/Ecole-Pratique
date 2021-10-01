package com.mvcdemo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilisateurControleur {
	@Value("#{paysListe}") 
	private Map<String, String> paysListe;

	@RequestMapping("/afficheUtilisateurForm")
	public String afficheForm(Model leModel) {
	leModel.addAttribute("utilisateur", new Utilisateur());
	leModel.addAttribute("laListeDesPays", paysListe);

	return "utilisateur-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm( 
	@ModelAttribute("utilisateur") Utilisateur unUtilisateur){
	//log la donnée entrante unUtilisateur.getNom();
	return "utilisateur-vue";
	}
}
