package com.mvcdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("hello")
public class DemoController {
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	@GetMapping("menu")
	public String showMenu() {
		return "main-menu";
	}
	@GetMapping ("getSalutationForm")
	public String afficheSalutationForm() {
		return  "salutation-form";
	}
	@GetMapping ("postSalutationForm")
	public String traiteSalutationForm(@RequestParam("name") String nom, Model model) {
		//String nom= request.getParameter("name");
		String result = "Salut"+nom.toUpperCase(); 
		model.addAttribute("message", result);
		return  "salutation";
	}
	
}
