package com.capgemini.flp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.flp.service.ILoginService;

@Controller
public class LoginController {
	@Autowired
	private ILoginService service;
	
	/*@RequestMapping(value="/",method=RequestMethod.GET)
	public  String showLoginForm() {
		return "userLogin";
	}*/
	
	
	@RequestMapping(value="/adminlogin",method=RequestMethod.GET)
	public  void loginVerifier(@RequestParam("email") String email,@RequestParam("password") String pass) {
		 service.loginVerifier(email,pass);
		 
	}	
}



				
	