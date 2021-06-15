package com.QuanWebDeveloper.Dto;

import com.QuanWebDeveloper.Entity.Product;

public class CartDto {
	private int quanty;
	private float totalPrice;
	private Product product;
	
	public CartDto() {
		
	}
	
	public CartDto(int quanty, float totalPrice, Product product) {
		this.quanty = quanty;
		this.totalPrice = totalPrice;
		this.product = product;
	}
	
	public int getQuanty() {
		return quanty;
	}
	
	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}
	
	public float getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
}
