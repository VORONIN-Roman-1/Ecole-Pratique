package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dao.UserDao;
import com.spring.entity.User;


@Controller
@RequestMapping("/user")
public class UsersController {
	//@Autowired
	//private UserDao userDao;
	@GetMapping("list")
	public String getUserList(){
//		List <User> users = userDao.getUsers();
//		for (User user : users) {
//			System.out.println(user.getNom());
//		}
		return "list-users";
		
		
	}
}
