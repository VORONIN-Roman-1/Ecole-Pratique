package com.tld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tld.dao.UserDao;
import com.tld.entities.User;
import com.tld.service.UserService;

@Controller 
public class UserController {

	
//	@Autowired
//	private UserDao userDao;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users/list")
	public String listAllUsers( Model theModel) {
		List<User> users=  userService.getAllUsers();
		theModel.addAttribute("users", users);
		
		for(int i =0 ; i<users.size();i++) {
			System.out.println( users.get(i));
		}
		return "list-users";
	}
}
