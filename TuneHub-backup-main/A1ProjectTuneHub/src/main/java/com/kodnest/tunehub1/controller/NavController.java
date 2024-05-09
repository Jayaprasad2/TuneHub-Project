package com.kodnest.tunehub1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class NavController {

	@GetMapping("/login")
	public String login(){
		return "login";
	}

	@GetMapping("/registration")
	public String registration(){
		return "registration";
	}

	@GetMapping("/newsong")
	public String newsong() {
		return "newsong";
	}
}
