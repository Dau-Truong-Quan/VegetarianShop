package com.QuanWebDeveloper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.QuanWebDeveloper.service.CategoryService;
import com.QuanWebDeveloper.service.ProductService;

@Controller(value = "detailControllerOfWeb")
@RequestMapping(value = "/detail")
public class DetaiController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	   public ModelAndView detaiPage(@PathVariable("id") int id) {
		System.out.println(id);
		ModelAndView mav = new ModelAndView("web/detail");
		mav.addObject("detailProduct", productService.getProductById(id));
		mav.addObject("listCategory", categoryService.getAll());
		mav.addObject("lastProduct", productService.getLast());
	      return mav; 
	   }
}
