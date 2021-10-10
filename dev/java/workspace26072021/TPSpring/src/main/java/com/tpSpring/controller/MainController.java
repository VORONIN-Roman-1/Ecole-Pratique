package com.tpSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tpSpring.entity.User;
import com.tpSpring.service.UserService;


@Controller
@RequestMapping("users")
public class MainController {
	@Autowired
	private UserService userService;
	
//	@GetMapping("/")
//	public String showHome() {
//		System.out.println("home is responding");
//		return "list-users";
//	}

	@GetMapping("list")
	public String listAllUsers( Model theModel) {
		List<User> users=  userService.getUsers();
		theModel.addAttribute("users", users);
		
		for(int i =0 ; i<users.size();i++) {
			System.out.println( users.get(i));
		}
		return "list-users";
	}
	
	@GetMapping("/montrerFormulaireCreate")
	public String showUserForm(Model  model) {	
		User user =new User();
		model.addAttribute("user", user);
		return "form-user";
	}
	@PostMapping("/sauvegarderUser")
	public String saveUser(@ModelAttribute ("user" ) User user) {
		userService.saveUser(user);
		return "redirect:/users/list";
		
	}
	@GetMapping("/montrerFormulaireEdition")
	public  String montrerFormulaireEdition(@RequestParam("id") int id, Model model) {
		
		User userToEdit = userService.getUser(id);
		model.addAttribute("user", userToEdit);
		return "form-user";
		
	}
	@GetMapping("/deleteById")
	public String deleteUser (@RequestParam ("id") int id ) {
		userService.delete(id);
		
		return "redirect:/users/list";
	}
	
}
