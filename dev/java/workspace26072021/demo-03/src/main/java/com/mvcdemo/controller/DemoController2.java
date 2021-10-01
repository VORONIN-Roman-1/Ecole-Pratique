package com.mvcdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello2")
public class DemoController2 {

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
	public String receptionneSalutationForm(@RequestParam("userName") String nom, Model model) {
		String leNom= nom.toUpperCase();
		String result= "You !"+ leNom;
		model.addAttribute("message", result);
		return "salutation-message";
	}

}
