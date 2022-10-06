package com.qa.java.arrays;

public class ArrayMain {
	
	public static void main(String[] args) {
		
		int number[] = {1,6,2,8,3,9,15,0};
		
	    ArrayUtil.sum(number);
		ArrayUtil.minNumber(number);
		ArrayUtil.maxNumber(number);
		
		
		Product product1 = new Product(111, "Dresses", 1000.0f, "Cloths", (byte)4, 40, false);
		Product product2 = new Product(112, "top", 2000.0f, "Cloths", (byte)9, 40, false);
		Product product3 = new Product(113, "pant", 3000.0f, "Cloths & Garments", (byte)8, 40, false);
		
		Product[] products = {product1,product2,product3};
		
		
		
		Product productleastprice = ArrayUtil.getLeastPriceProduct(products);
		System.out.println("product with least price is : " + productleastprice.price);
		
		Product productHighestPrice = ArrayUtil.getHigestPriceProduct(products);
		System.out.println("product with highest price is : " + productHighestPrice.price);
		
		
		
		Product productHighestRating = ArrayUtil.getHigestRatingProduct(products);
		System.out.println("product with highest rating  is : " + productHighestRating.rating);
		
		
		
	}

}
