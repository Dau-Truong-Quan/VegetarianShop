package com.QuanWebDeveloper.serviceImpl;

import java.util.List;

import com.QuanWebDeveloper.Entity.Product;

public interface ProductServiceImpl {
	public List<Product> ListProduct();
	public Product getLast();
	public Product getProductById(int id);
	public List<Product> getListProductByCategory(int cate_id);
	public List<Product> getListProductByName(String txtSearch);
	public void addProductEntity( String name, int price, String image,String description, int quantity, int cate_id);
	public void removeProduct(int id);
}
