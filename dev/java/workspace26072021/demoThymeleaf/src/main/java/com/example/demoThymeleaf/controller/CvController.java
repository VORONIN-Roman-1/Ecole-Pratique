package com.example.demoThymeleaf.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demoThymeleaf.service.ICvService;

@Controller
public class CvController {
@Autowired
private ICvService service;
@GetMapping("/")
public String getallCvitems(Model model) {
Map<String, List> l = service.listAllCvItems();
model.addAttribute("competences", l.get("competences"));
model.addAttribute("experiences", l.get("experiences"));
model.addAttribute("formations", l.get("formations"));
return "cv-page";
}
}
