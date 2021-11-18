package com.winno.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class NewsController {

	@GetMapping("index")
	public String index(Model model, HttpSession session) {
		if (session.getAttribute("USER") == null) {
			return "redirect:/home/login";
		}
		return "home.index";
	}
	
	@GetMapping("contact")
	public String contact(Model model, HttpSession session) {
		
		return "home.contact";
	}
	@GetMapping("post")
	public String post(Model model, HttpSession session) {
		
		return "home.post";
	}
	@GetMapping("about")
	public String about(Model model, HttpSession session) {
		
		return "home.about";
	}
}
