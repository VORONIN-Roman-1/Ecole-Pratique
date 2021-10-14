package fr.ecole.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {

	// code pour le end point "/hello"
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!";
	}
}