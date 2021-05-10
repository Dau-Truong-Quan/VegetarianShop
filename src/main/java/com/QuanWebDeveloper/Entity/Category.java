package com.QuanWebDeveloper.Entity;

public class Category {
	private int Id;
	private String name;
	private String slug;
	
	
		
		
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public Category(int Id, String name, String slug) {
		super();
		this.Id = Id;
		this.name = name;
		this.slug = slug;
	}
	public Category() {
		super();
	}
	
	
}
