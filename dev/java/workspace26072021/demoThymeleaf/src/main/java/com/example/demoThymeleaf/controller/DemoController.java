package com.example.demoThymeleaf.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demoThymeleaf.repository.MessageRepository;

@Controller
public class DemoController {
	@Autowired
	private MessageRepository repo;

	@GetMapping("/hello")
	public String helloMethod(Model model) {
		model.addAttribute("dateDuJour", new Date());
		return "hello";
	}

	@GetMapping("/messages")
	public String messageAcceuil(Model model) {
		model.addAttribute("messages", repo.findAll());
		return "list-messages";
	}
}
