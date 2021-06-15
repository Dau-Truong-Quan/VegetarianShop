package com.QuanWebDeveloper.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QuanWebDeveloper.Dto.CartDto;
import com.QuanWebDeveloper.Dto.ItemDto;
import com.QuanWebDeveloper.Dto.OrderDto;


import com.QuanWebDeveloper.repository.OrderRepository;
import com.QuanWebDeveloper.serviceImpl.OrderServiceImpl;

@Service
public class OrderService implements OrderServiceImpl{

	@Autowired
	private OrderRepository orderRepository;
	
	public int AddOrder(OrderDto oderDto) {
		
		return orderRepository.AddOrder(oderDto);
	}

	public int GetIdLastOrder() {
		// TODO Auto-generated method stub
		return orderRepository.GetIdLastOrder();
	}

	

	public void AddAllOrdersDetail(HashMap<Integer, CartDto> carts) {
		int idOrder = orderRepository.GetIdLastOrder();
		for(Map.Entry<Integer, CartDto> itemCart : carts.entrySet()) {
			ItemDto itemDto = new ItemDto();
			itemDto.setOrderId(idOrder);
			itemDto.setPrice(itemCart.getValue().getTotalPrice());
			itemDto.setProductId(itemCart.getValue().getProduct().getId());
			itemDto.setQuantity(itemCart.getValue().getQuanty());
			orderRepository.AddOrdersDetail(itemDto);
		}
		
	}

}
