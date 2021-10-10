package com.tpSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tpSpring.entity.User;
import com.tpSpring.service.UserService;


@Controller
public class MainController {
	@Autowired
	private UserService userService;
	
//	@GetMapping("/")
//	public String showHome() {
//		System.out.println("home is responding");
//		return "list-users";
//	}

	@GetMapping("/users/list")
	public String listAllUsers( Model theModel) {
		List<User> users=  userService.getUsers();
		theModel.addAttribute("users", users);
		
		for(int i =0 ; i<users.size();i++) {
			System.out.println( users.get(i));
		}
		return "list-users";
	}
	
}
