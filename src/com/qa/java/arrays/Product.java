package com.qa.java.arrays;

public class Product {


	int id;
	String name;
	float price;
	String category;
	byte rating ;
	float discountPercentage;
	boolean isAvailable;
	
	public Product(int id, String name, float price, String category, byte rating, float discountPercentage,
			boolean isAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
	}
	
	
	


void productInformation() {
		
		System.out.println("inside product information method");
		System.out.println(id);
	}
	
	float discountPrice() {
		//float discountPriceValue = price * discountPercentage /100;
		return price * discountPercentage /100;
	}
	
	float finalPrice() {
	
		return price-discountPrice();
	}
}
