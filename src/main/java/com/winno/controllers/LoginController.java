package com.winno.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.winno.daos.UserDao;
import com.winno.models.User;

@Controller
@RequestMapping("home")
public class LoginController{
	

	
	@Autowired
	private UserDao userDao;

	public static final String MSG_ERR = "Username hoặc Password không chính xác";
	public static final String MSG_BLOCK = "Tài khoản đã bị khoá";
	
	private List<User> listUser = new ArrayList<User>();




	@GetMapping("login")
	public String login(HttpSession session) {
		if (session.getAttribute("USER") != null) {
			return "redirect:/home/index";
		}
		listUser = userDao.getList();
		return "views/login/login";
	}

	@PostMapping("login")
	public String login(Model model, @ModelAttribute User user, HttpSession session, RedirectAttributes ra) {
		String username = user.getUsername();
		String password = user.getPassword();
		
		for(User userTemp : listUser) {
			if(userTemp.getUsername().equals(username) && userTemp.getPassword().equals(password)) {
				if(userTemp.getStatus().equals("de-active")) {
					System.out.println("block");
					ra.addFlashAttribute("MSG_ERROR", MSG_BLOCK);
					return "redirect:/home/login";
				}
				session.setAttribute("USER", userTemp);
				return "redirect:/home/index";
			}
		}
		System.out.println("Sai");
		ra.addFlashAttribute("MSG_ERROR",  MSG_ERR);
		return "redirect:/home/login";
				
		
	}
	
}
