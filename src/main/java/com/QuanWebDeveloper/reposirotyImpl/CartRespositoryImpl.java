package com.QuanWebDeveloper.reposirotyImpl;

import java.util.HashMap;

import com.QuanWebDeveloper.Dto.CartDto;

public interface CartRespositoryImpl {
	public HashMap<Integer, CartDto> AddCart(int id, HashMap<Integer , CartDto> cart);

	public HashMap<Integer, CartDto> EditCart(int id, int quanty, HashMap<Integer , CartDto> cart);

	public HashMap<Integer, CartDto> DeleteCart(int id, HashMap<Integer , CartDto> cart);

	public int TotalQuanty(HashMap<Integer , CartDto> cart);

	public double TotalPrice(HashMap<Integer , CartDto> cart);
}
