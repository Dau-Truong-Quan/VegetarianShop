package com.QuanWebDeveloper.Dto;

public class ProductDto {
	private int id;
	
	private String name;
	
	private String price;
	
	private String salePrice;
	
	private String image;
	

	
	private String description;
	
	private String quantity;
	
	private int categoryId;
	
	



	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public ProductDto(int id, String name, String price, String salePrice, String image, String description,
			String quantity, int categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.salePrice = salePrice;
		this.image = image;

		this.description = description;
		this.quantity = quantity;
		this.categoryId = categoryId;
	}



	public ProductDto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
}
