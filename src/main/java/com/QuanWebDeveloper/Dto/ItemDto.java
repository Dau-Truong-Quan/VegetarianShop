package com.QuanWebDeveloper.Dto;

public class ItemDto {

	private int itemId;
	private int quantity;
	private float price;
	private int productId;
	private int orderId;

	public ItemDto() {
		super();
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public ItemDto(int itemId, int quantity, float price, int productId, int orderId) {
		super();
		this.itemId = itemId;
		this.quantity = quantity;
		this.price = price;
		this.productId = productId;
		this.orderId = orderId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float d) {
		this.price = d;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
	
}	
