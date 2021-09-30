package com.mvcdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String showHome() {
		System.out.println("home is responding");
		return "home";
	}

	@GetMapping("getSaluttationForm")
	public String afficheSalutationForm() {
		
		return "saluttation-form";
	}
	@GetMapping("postSalutationForm")
	public String receptionneSalutationForm(HttpServletRequest request, Model model) {
		String leNom= request.getParameter("userName");
		leNom= leNom.toUpperCase();
		String result= "Yo !"+ leNom;
		model.addAttribute("message", result);
		return "salutation-message";
	}

}
