package com.QuanWebDeveloper.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "logoutControllerOfWeb")
@RequestMapping(value = "/logout")
public class LogoutController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	   public String loginPage(HttpSession session) {
		
		session.removeAttribute("mySessionAttribute");
		return "redirect:/login";
	      
	   }
}
