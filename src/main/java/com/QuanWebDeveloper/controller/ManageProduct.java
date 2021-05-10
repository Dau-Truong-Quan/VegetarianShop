package com.QuanWebDeveloper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.QuanWebDeveloper.service.CategoryService;
import com.QuanWebDeveloper.service.ProductService;

@Controller(value = "manageControllerOfWeb")
@RequestMapping(value = "/manageProduct")
public class ManageProduct {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	   public ModelAndView manageProductPage() {
		ModelAndView mav = new ModelAndView("web/manageProduct");
		mav.addObject("listProduct", productService.ListProduct());
		mav.addObject("listCategory", categoryService.getAll());
	      return mav; 
	   }
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	   public String addProductPage(
			   @RequestParam("name") String name,
				@RequestParam("price") int price,
				@RequestParam("image") String image,
				@RequestParam("description") String description,
				@RequestParam("quantity") int quantity,
				@RequestParam("cate_id") int cate_id) {
				
		productService.addProductEntity(name, price, image, description, quantity, cate_id);;
		
	      return "redirect:/manageProduct"; 
	   }
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	   public String deleteProductPage(@PathVariable("id") int id) {
				
		
			productService.removeProduct(id);
	      return "redirect:/manageProduct"; 
	   }

}
