package com.QuanWebDeveloper.Entity;

public class Feedback {
	private int feedbackId;
	private String feedName;
	private String feedbackEmail;
	private String feedbackRate;
	private String description;
	private int productId;
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getFeedName() {
		return feedName;
	}
	public void setFeedName(String feedName) {
		this.feedName = feedName;
	}
	public String getFeedbackEmail() {
		return feedbackEmail;
	}
	public void setFeedbackEmail(String feedbackEmail) {
		this.feedbackEmail = feedbackEmail;
	}
	public String getFeedbackRate() {
		return feedbackRate;
	}
	public void setFeedbackRate(String feedbackRate) {
		this.feedbackRate = feedbackRate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public Feedback(int feedbackId, String feedName, String feedbackEmail, String feedbackRate, String description,
			int productId) {
		super();
		this.feedbackId = feedbackId;
		this.feedName = feedName;
		this.feedbackEmail = feedbackEmail;
		this.feedbackRate = feedbackRate;
		this.description = description;
		this.productId = productId;
	}
	public Feedback() {
		super();
	}
	
	
}
