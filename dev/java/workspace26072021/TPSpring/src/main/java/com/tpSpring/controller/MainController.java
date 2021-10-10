package com.tpSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tpSpring.dao.UserDao;
import com.tpSpring.entity.User;


@Controller
public class MainController {
	@Autowired
	private UserDao userDao;
	
	@GetMapping("/")
	public String showHome() {
		System.out.println("home is responding");
		return "list-users";
	}

	@GetMapping("/users/list")
	public String listAllUsers( Model theModel) {
		List<User> users=  userDao.getAllUsers();
		theModel.addAttribute("users", users);
		
		for(int i =0 ; i<users.size();i++) {
			System.out.println( users.get(i));
		}
		return "list-users";
	}
	
}
