package com.QuanWebDeveloper.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QuanWebDeveloper.Dto.CartDto;
import com.QuanWebDeveloper.repository.CartRepository;
import com.QuanWebDeveloper.serviceImpl.CartServiceImpl;

@Service
public class CartService implements CartServiceImpl{
	
	@Autowired
	CartRepository cartRepository;

	public HashMap<Integer, CartDto> AddCart(int id, HashMap<Integer, CartDto> cart) {
		return cartRepository.AddCart(id, cart);
	}

	public HashMap<Integer, CartDto> EditCart(int id, int quanty, HashMap<Integer, CartDto> cart) {
		return cartRepository.EditCart(id, quanty, cart);
	}

	public HashMap<Integer, CartDto> DeleteCart(int id, HashMap<Integer, CartDto> cart) {
		return cartRepository.DeleteCart(id, cart);
	}

	public int TotalQuanty(HashMap<Integer, CartDto> cart) {
		return cartRepository.TotalQuanty(cart);
	}

	public double TotalPrice(HashMap<Integer, CartDto> cart) {
		return cartRepository.TotalPrice(cart);
	}


	
}
