package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.service.UserService;

@Controller
public class UserController2 {
	
	@Autowired(required=true)
	@Qualifier("UserServiceImpl")
	UserService userService;
	
	@RequestMapping("/login2.do")
	public String login(Model model) {
		System.out.println("Controller");
		model.addAttribute("message", userService.login());
		return "showMessage";
	}
}
