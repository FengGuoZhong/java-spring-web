package com.gg.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gg.bean.User;


@Controller
@RequestMapping("/")
public class UserController {

	@RequestMapping("/hello")
	@ResponseBody
	String home() {
		System.out.print("hello");
	    return "Hello ,spring boot!";
	}

	
	@RequestMapping("/")
	public String index() {
		System.out.print("index");
		return "index";
	}
	
	@RequestMapping("/userLogin")
	public String userLogin(Model model) {
		User user = new User("guozhong",30);
		model.addAttribute("user",user);
		return "userLogin";
	}
}
