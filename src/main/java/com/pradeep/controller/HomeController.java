package com.pradeep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pradeep.dto.RegisterDTO;
import com.pradeep.entity.UserEntity;
import com.pradeep.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public String loginPage(){
		return "login";
	}
	
	@PostMapping("/login")
	public String loginUser(
			@RequestParam(name = "userName") String username,
			@RequestParam(name = "password") String password,
			Model model,HttpSession session
			){
		UserEntity loggedInUser=userService.validateUser(username, password);
		
		if(loggedInUser!=null) {
			session.setAttribute("loggedInUser", loggedInUser);
			
			return "redirect:/dashboard";
		}else {
			return "login";
		}
	}
	
	@GetMapping("/register")
	public String register(){
		return "register";
	}
	
	@PostMapping("/register")
	public String registerUser(
			@RequestParam(name = "userName") String username,
			@RequestParam(name = "firstName") String firstName,
			@RequestParam(name = "lastName") String lastName,
			@RequestParam(name = "password") String password,
			@RequestParam(name = "confirmPassword") String confirmPassword,
			@RequestParam(name = "phoneNumber") String phoneNumber,
			@RequestParam(name = "address") String address,
			@RequestParam(name = "email") String email
			){
		UserEntity user=new UserEntity(username, confirmPassword, firstName, lastName, address, phoneNumber, email);
		boolean registeredUser=userService.registerUser(user);
		if(registeredUser) {
			return "login";
		}else {
			return "register";
		}
	}
}
