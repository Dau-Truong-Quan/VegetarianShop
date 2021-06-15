package com.QuanWebDeveloper.serviceImpl;

import java.util.HashMap;

import com.QuanWebDeveloper.Dto.CartDto;
import com.QuanWebDeveloper.Dto.ItemDto;
import com.QuanWebDeveloper.Dto.OrderDto;

public interface OrderServiceImpl {
	public int AddOrder(OrderDto oderDto);
	public int GetIdLastOrder();
	public void AddAllOrdersDetail(HashMap<Integer,CartDto> carts);
}
