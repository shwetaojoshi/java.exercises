package com.qa.java.oop;

public class Product {

	public int id;
	public String name;
	public float price;
	public String category;
	public byte rating ;
	public float discountPercentage;
	public boolean isAvailable;
	
	static String sellername = "Amazon";
	static int contact_no = 1234567891;
	static String emailid= "amazonHelp@gmail.com";
	
	static void sellerInfo() {
		System.out.println("inside static method ");
		System.out.println("seller name is :"+sellername);
		System.out.println("seller contact no is :"+contact_no);
		System.out.println("seller email id  is :"+emailid);
	}
	

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
	
	public void productInformation() {
		
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
	
	/*
	 * void discountPriceWithVoid(){
	 * 
	 * float discountPriceValue = price*discountPercentage/100;
	 * System.out.println("discount price inside void method is " +
	 * discountPriceValue);
	 * 
	 * }
	 */
	
	
	
	
	/*
	 * public Product(int id, String name, float price, String category, byte
	 * rating, float discountPercentage, boolean isAvailable) { super(); this.id =
	 * id; this.name = name; this.price = price; this.category = category;
	 * this.rating = rating; this.discountPercentage = discountPercentage;
	 * this.isAvailable = isAvailable; }
	 */



	
	
}