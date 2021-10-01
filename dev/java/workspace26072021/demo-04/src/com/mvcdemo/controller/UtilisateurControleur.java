package com.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilisateurControleur {
@GetMapping("/afficheUtilisateurForm")
public String afficheForm(Model leModel) {
leModel.addAttribute("utilisateur", new Utilisateur());
return "utilisateur-form";
}
@PostMapping("/processForm")
public String processForm( 
@ModelAttribute("utilisateur") Utilisateur unUtilisateur){
//log la donnée entrante unUtilisateur.getNom();
return "utilisateur-vue";
}
}