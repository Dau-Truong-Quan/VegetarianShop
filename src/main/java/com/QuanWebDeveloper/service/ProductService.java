package com.QuanWebDeveloper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QuanWebDeveloper.Entity.Product;
import com.QuanWebDeveloper.repository.ProductRepository;
import com.QuanWebDeveloper.serviceImpl.ProductServiceImpl;

@Service
public class ProductService implements ProductServiceImpl{

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> ListProduct() {
		
		return productRepository.listProductEntity();
	}

	public Product getLast() {
		// TODO Auto-generated method stub
		return productRepository.getLast();
	}

	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return productRepository.getProductById(id);
	}

	public List<Product> getListProductByCategory(int cate_id) {
		// TODO Auto-generated method stub
		return productRepository.getListProductByCategory(cate_id);
	}

	public List<Product> getListProductByName(String txtSearch) {
		// TODO Auto-generated method stub
		return productRepository.getListProductByName(txtSearch);
	}

	public void addProductEntity(String name, int price, String image, String description, int quantity, int cate_id) {
		productRepository.addProductEntity(name, price, image, description, quantity, cate_id);
		
	}

	public void removeProduct(int id) {
		productRepository.removeProduct(id);
		
	}

}
