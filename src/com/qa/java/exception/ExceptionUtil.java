package com.qa.java.exception;

import com.qa.java.oop.Product;

public class ExceptionUtil {

	int division(int no1, int no2) {
		
		return no1/no2;
	}

	void getProductDetails(Product product) {
		
		product.productInformation();

	}
	
	Product getProductById(int id) throws ProductNotFoundException{
		Product product = null;
		
		Product product1 = new Product(111, "Dresses", 1000.0f, "Cloths", (byte)4, 40, false);
		Product product2 = new Product(112, "top", 2000.0f, "Cloths", (byte)9, 40, false);
		Product product3 = new Product(113, "pant", 3000.0f, "Cloths & Garments", (byte)8, 40, false);
		
		Product[] products = {product1,product2,product3};
		
		for(Product p : products) {
			if(p.id == id) {
				product = p;
				
			}
		}
		if(product == null) {
			throw new ProductNotFoundException("Product does not exist");
		}
				
	
		return product;
		
	}


}
