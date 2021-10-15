package com.ecole.crudapidemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecole.crudapidemo.dao.MessageDao;
import com.ecole.crudapidemo.entity.Message;

@RestController
@RequestMapping("/api")
public class MainController {
	
	@Autowired
	private MessageDao dao;
	@GetMapping("/messages")
	public List<Message> getAllMessage(){
		return dao.findAll();
	}
	@PostMapping("/messages")
	public void postMessage(@RequestBody Message message) {
		dao.addMessage(message);
	}
	@GetMapping("/messages/{id}")
	public Message getMessageById(@PathVariable(name= "id") int id){
		return dao.findById(id);
	}
	
	
	@GetMapping("")
	public String sayHello() {
		System.out.println("on teste la dao findAll");
		for (Message m : dao.findAll())
			System.out.println(m);
		return "Hello TP Spring Boot";
	}
}
