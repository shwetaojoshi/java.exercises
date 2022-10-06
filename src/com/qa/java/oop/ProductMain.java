package com.qa.java.oop;

public class ProductMain {

	public static void main(String[] args) {

		Product product4 = new Product(4, "shweta", 100, "books", (byte) 10, 20, true);
		System.out.println("Product 4 id is :" + product4.id);

		product4.productInformation();
		System.out.println("discount prise is : " + product4.discountPrice());
		System.out.println("final price after discount " + product4.finalPrice());
		
		Product.sellerInfo();

		/*
		 * Product product1 = new Product(); Product product2 = new Product(); Product
		 * product3 = new Product();
		 */

		/*
		 * product1.id = 111; product1.name = "toy"; product1.price = 20;
		 * product1.category = "children"; product1.rating = 8;
		 * product1.discountPercentage = 9; product1.isAvailable = true ;
		 * 
		 * product2.id = 112; product2.name = "book"; product2.price = 120;
		 * product2.category = "Science"; product2.rating = 5;
		 * product2.discountPercentage = 10; product2.isAvailable = true ;
		 * 
		 * product3.id = 113; product3.name = "pen"; product3.price = 10;
		 * product3.category = "Accessories"; product3.rating = 6;
		 * product3.discountPercentage = 1; product3.isAvailable = false ;
		 */

		/*
		 * System.out.println("Product 1 id is :" + product1.id);
		 * System.out.println("Product 1 name is :" + product1.name);
		 * System.out.println("Product 1 Price is :" + product1.price);
		 * System.out.println("Product 1 Price is :" + product1.price);
		 * System.out.println("Product 1 Category is :" + product1.category);
		 * 
		 * 
		 * 
		 * System.out.println("Product 2 id is :" + product2.id);
		 * System.out.println("Product 2 name is :" + product2.name);
		 * System.out.println("Product 2 Price is :" + product2.price);
		 * 
		 * 
		 * 
		 * System.out.println("Product 3 id is :" + product3.id);
		 * System.out.println("Product 3 name is :" + product3.name);
		 * System.out.println("Product 3 Price is :" + product3.price);
		 */

		// product4.discountPriceWithVoid();

	}

}
