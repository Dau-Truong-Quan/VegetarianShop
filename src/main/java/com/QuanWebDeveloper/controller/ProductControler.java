package com.QuanWebDeveloper.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.QuanWebDeveloper.Entity.Product;
import com.QuanWebDeveloper.service.CategoryService;

import com.QuanWebDeveloper.service.ProductService;

@Controller(value = "homeControllerOfWeb")
@RequestMapping(value = "/trang-chu")
public class ProductControler {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	   public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("web/home");
		mav.addObject("listProduct", productService.ListProduct());
		mav.addObject("listCategory", categoryService.getAll());
		mav.addObject("lastProduct", productService.getLast());
	      return mav; 
	   }
	
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	   public ModelAndView homeCategoryPage(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("web/home");
		
		mav.addObject("listProduct", productService.getListProductByCategory(id));
		mav.addObject("category_id", id);
		mav.addObject("listCategory", categoryService.getAll());
		mav.addObject("lastProduct", productService.getLast());
	      return mav; 
	   }
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	   public ModelAndView homeSearchByName(@RequestParam("txtSearch") String name) {
		ModelAndView mav = new ModelAndView("web/home");
//		List<Product> list = productService.getListProductByName(name);
//		try {
//			for(Product o : list) {
//				response.getWriter().println("<div class=\"product col-12 col-md-6 col-lg-4\">\n"
//	                    + "                                <div class=\"card\">\n"
//	                    + "                                    <img class=\"card-img-top\" src=\""+o.getImage()+"\" alt=\"Card image cap\">\n"
//	                    + "                                    <div class=\"card-body\">\n"
//	                    + "                                        <h4 class=\"card-title show_txt\"><a href=\"detail?pid="+o.getId()+"\" title=\"View Product\">"+o.getName()+"</a></h4>\n"
//	                    + "                                        <p class=\"card-text show_txt\">"+o.getQuantity()+"</p>\n"
//	                    + "                                        <div class=\"row\">\n"
//	                    + "                                            <div class=\"col\">\n"
//	                    + "                                                <p class=\"btn btn-danger btn-block\">"+o.getPrice()+" $</p>\n"
//	                    + "                                            </div>\n"
//	                    + "                                            <div class=\"col\">\n"
//	                    + "                                                <a href=\"#\" class=\"btn btn-success btn-block\">Add to cart</a>\n"
//	                    + "                                            </div>\n"
//	                    + "                                        </div>\n"
//	                    + "                                    </div>\n"
//	                    + "                                </div>\n"
//	                    + "                            </div>");
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		mav.addObject("listProduct", productService.getListProductByName(name));
		mav.addObject("listCategory", categoryService.getAll());
		mav.addObject("lastProduct", productService.getLast());
		
		return mav;
	   
	   }
	
//	@RequestMapping(value = "/dang-nhap", method = RequestMethod.GET)
//	   public ModelAndView login() {
//		
//		ModelAndView mav = new ModelAndView("web/login");
//		
//	  
//	      return mav; 
//	   }
	  
//	   @RequestMapping(value = "/springmvc", method = RequestMethod.GET)
//	   public ModelAndView springMVCPage() {
//	      ModelAndView mav = new ModelAndView();
//	      mav.setViewName("springmvc");
////	      mav.addObject("menu",homeService.loadMenu());
//	      return mav; 
//	   }
	   
//	   @RequestMapping("/springmvc")
//	   public String springMVCPage(ModelMap map) {
//		   map.addAttribute("menu", "dau truong quan"); 
//	      return "home"; 
//	   }
}
