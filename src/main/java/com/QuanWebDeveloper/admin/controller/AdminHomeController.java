package com.QuanWebDeveloper.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller(value ="homeControllerOfAdmin")
public class AdminHomeController {
	
	
	
	@RequestMapping(value = "/admin/trang-chu", method = RequestMethod.GET)
	   public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/home");
	      return mav; 
	   }
	
	@RequestMapping(value = "/admin/bai-viet/chinh-sua", method = RequestMethod.GET)
	   public ModelAndView showList() {
		ModelAndView mav = new ModelAndView("admin/home");
	      return mav; 
	   }
	
}
