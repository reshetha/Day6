package com.capgemini.day6;

public class Television 
{
	private String company;
	private String model;
	private String enabled;
	private double price;
	public Television() {
		super();
	
	}
	public Television(String company, String model, String enabled, double price) {
		super();
		this.company = company;
		this.model = model;
		this.enabled = enabled;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}