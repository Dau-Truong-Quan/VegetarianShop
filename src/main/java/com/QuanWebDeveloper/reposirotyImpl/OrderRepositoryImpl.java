package com.QuanWebDeveloper.reposirotyImpl;

import com.QuanWebDeveloper.Dto.ItemDto;
import com.QuanWebDeveloper.Dto.OrderDto;

public interface OrderRepositoryImpl {
	
	public int AddOrder(OrderDto oderDto);
	public int GetIdLastOrder();
	public int AddOrdersDetail(ItemDto itemDto);
}
