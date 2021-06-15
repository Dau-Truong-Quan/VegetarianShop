package com.QuanWebDeveloper.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.QuanWebDeveloper.Dto.CartDto;

import com.QuanWebDeveloper.Dto.OrderDto;
import com.QuanWebDeveloper.Entity.User;

import com.QuanWebDeveloper.service.CartService;
import com.QuanWebDeveloper.service.CategoryService;
import com.QuanWebDeveloper.service.OrderService;
import com.QuanWebDeveloper.service.ProductService;




@Controller(value = "cartControllerOfWeb")
@RequestMapping(value = "/cart")
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	   public ModelAndView detaiPage() {
		ModelAndView mav = new ModelAndView("/web/cart");
	      return mav; 
	   }
	
	@RequestMapping(value = "AddCart/{id}")
	public String AddCart(HttpServletRequest request ,HttpSession session, @PathVariable int id) {
		HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>)session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Integer, CartDto>();
		}
		cart = cartService.AddCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartService.TotalQuanty(cart));
		session.setAttribute("TotalPriceCart", cartService.TotalPrice(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value = "DeleteCart/{id}")
	public String DeleteCart(HttpServletRequest request ,HttpSession session, @PathVariable int id) {
		HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>)session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Integer, CartDto>();
		}
		cart = cartService.DeleteCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartService.TotalQuanty(cart));
		session.setAttribute("TotalPriceCart", cartService.TotalPrice(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value = "Order", method = RequestMethod.GET)
	public ModelAndView Order(HttpServletRequest request ,HttpSession session) {

		ModelAndView mav = new ModelAndView("web/order");
		OrderDto orderDto = new OrderDto();
		User user = (User) session.getAttribute("mySessionAttribute");
		if(user != null) {
			orderDto.setUserId(user.getId());
			orderDto.setAddress(user.getAddress());
			orderDto.setStatusId(1);
			orderDto.setShipperId(1);
			session.setAttribute("Order", orderDto);
		}else {
			mav = new ModelAndView("redirect:/login");
		}
		
	
		
		
		
		return mav;
	}
	
	@RequestMapping(value = "Order", method = RequestMethod.POST)
	public ModelAndView SaveOrder(HttpServletRequest request ,HttpSession session) {

		ModelAndView mav = new ModelAndView("web/home");
		
		OrderDto orderDto = (OrderDto) session.getAttribute("Order");
		
//		if(orderDto.getShipperId() > 0) {
//			session.removeAttribute("Cart");
//		}
		
		if(orderService.AddOrder(orderDto) > 0) {
			HashMap<Integer,CartDto> carts = (HashMap<Integer, CartDto>) session.getAttribute("Cart");
			
			orderService.AddAllOrdersDetail(carts);
		}
		session.removeAttribute("Cart");
		mav.addObject("listProduct", productService.ListProduct());
		mav.addObject("listCategory", categoryService.getAll());
		mav.addObject("lastProduct", productService.getLast());

		return mav;
	}

}
