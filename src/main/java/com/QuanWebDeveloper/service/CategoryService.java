package com.QuanWebDeveloper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QuanWebDeveloper.Entity.Category;
import com.QuanWebDeveloper.repository.CategoryRepository;
import com.QuanWebDeveloper.serviceImpl.CategoryServiceImpl;

@Service
public class CategoryService implements CategoryServiceImpl{
	
	@Autowired
	CategoryRepository categoryRepository;

	public List<Category> getAll() {
		
		return categoryRepository.getAll();
	}

}
