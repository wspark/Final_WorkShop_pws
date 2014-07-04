package com.biz.product.vo;

public class Product {

	private String code;
	private String name;
	private int price;
	private int amount;
	private String discription;
	
	public Product(){
		
	}
	public Product(String code, String name, int price, int amount,	String discription){		
		this.code = code;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.discription = discription;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", price=" + price
				+ ", amount=" + amount + ", discription=" + discription + "]";
	}	
}

