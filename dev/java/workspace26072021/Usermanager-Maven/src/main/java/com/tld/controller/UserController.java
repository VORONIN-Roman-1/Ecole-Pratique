package com.tld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tld.entity.User;
import com.tld.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/list")
	public String listCustomers(Model model) {
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		return "list-users";
	}
	
	@GetMapping("/montrerFormulaireCreate")
	public String montrerFormulaireCreate(Model model) {
		// creer un attribut de model pour correspondre au formulaire 
		User user = new User();
		model.addAttribute("user", user);
		return "form-user";
	}
	
	@GetMapping("/montrerFormulaireUpdate")
	public String montrerFormulaireUpdate(@RequestParam("id") int id, Model model) {
		 //aller chercher l'utilisateur en bdd
		User user = userService.getUser(id);
		// passer cet utilisateur en tant que model attribute pour peupler le formulaire
		model.addAttribute("user",user);
		//renvoyer la page de formulaire
		return "form-user";
	}
	
	@PostMapping("/sauvegarderUser")
	public String saveUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);
		
		return "redirect:/user/list";
	}
	
	@GetMapping("/delete")
	public String deleteUser(@RequestParam("id") int id) {
		
		// supprimer l'utilisateur
		userService.delete(id);
		return "redirect:/user/list";
		
	}
	
	//search method
	@GetMapping("/search")
    public String searchUsers(@RequestParam("searchedName") String searchedName,
                                    Model theModel) {
		System.out.println("search method correctly map the search fomr submission");
        // search customers from the service
        List<User> users = userService.searchUsers(searchedName);
                
        // add the customers to the model
        theModel.addAttribute("users", users);

        return "list-users";        
    }
}
