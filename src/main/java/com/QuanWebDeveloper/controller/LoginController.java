package com.QuanWebDeveloper.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.QuanWebDeveloper.Entity.User;
import com.QuanWebDeveloper.service.LoginService;

@SessionAttributes("userSession")
@Controller(value = "loginControllerOfWeb")
@RequestMapping(value = "/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	

	
	@RequestMapping(value = "", method = RequestMethod.POST)
	   public ModelAndView homePage(@RequestParam("username") String email,@RequestParam("password") String password,HttpSession session) {
		
//		return "redirect:/trang-chu";
		
//		return "web/home";
		ModelAndView mav = new ModelAndView("web/login");
		
		
		User user = loginService.check(email, password);
	
		if(user == null) {
			mav.addObject("mess", "Wrong username or passrord");
			
			return mav;
		}else {		
			 mav.addObject("userSession", user);
			 session.setAttribute("mySessionAttribute", user);

			 mav = new ModelAndView("redirect:/trang-chu");
		}
	      return mav; 
	   }
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	   public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("web/login");
	      return mav; 
	   }
	

}
