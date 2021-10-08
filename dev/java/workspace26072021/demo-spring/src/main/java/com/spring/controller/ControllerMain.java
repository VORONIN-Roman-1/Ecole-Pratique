package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerMain {
	@GetMapping("/")
	public String helloTP() {
		return "hello";
	}
}
