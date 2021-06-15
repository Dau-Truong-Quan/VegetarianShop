package com.QuanWebDeveloper.Dto;

public class OrderDto {
	private int id;
	private int statusId;
	private int shipperId;
	private int userId;
	private String address;
	public OrderDto(int statusId, int shipperId, int userId, String address) {
		super();
		this.statusId = statusId;
		this.shipperId = shipperId;
		this.userId = userId;
		this.address = address;
	}
	public OrderDto() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public int getShipperId() {
		return shipperId;
	}
	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
