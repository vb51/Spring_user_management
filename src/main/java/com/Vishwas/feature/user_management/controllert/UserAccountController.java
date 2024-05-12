package com.Vishwas.feature.user_management.controllert;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Vishwas.feature.user_management.entity.UserAccount;
import com.Vishwas.feature.user_management.service.UserAccountService;

@Controller

public class UserAccountController {
	@Autowired
	private  UserAccountService service;

	// Load the form 
	@GetMapping("/") 
	
	public String index( Model model) {
		model.addAttribute("user",new UserAccount());
		return "index";
			
	}
	// Model is used to send data from controller to UI
	
	@PostMapping("/save-user")
	
	// catching the data in the form of object and again sending the data to reload the page
	 public String handleSubmitbutton (@ModelAttribute("user") UserAccount user, Model model ) {
	
		String msg = service.saveOrUpdateAcc(user);
		
		model.addAttribute("msg", msg);
		  
		 return "index";
	 }
	@GetMapping("/users")
	public String getUser (Model model) {
		List<UserAccount> userlist= service.getAllUserAccounts();
		model.addAttribute("user", userlist);
		return "view-user";
	}
	
	
}
