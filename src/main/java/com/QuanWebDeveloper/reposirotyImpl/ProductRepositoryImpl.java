package com.QuanWebDeveloper.reposirotyImpl;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.QuanWebDeveloper.Entity.Product;

public interface ProductRepositoryImpl {
	public void addProductEntity(Product p);
	public void updateProductEntity(Product p);
	public List<Product> listProductEntity();
	public Product getProductById(int id);
	public void removeProduct(int id);
	public Product getLast();
	public List<Product> getListProductByCategory(int cate_id);
	public List<Product> getListProductByName(String txtSearch);
	public void addProductEntity( String name, int price, String image,String description, int quantity, int cate_id);
}
