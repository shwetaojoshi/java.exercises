package com.qa.java.bean;

public class ProductService {


	public static void main(String args[]) {

		
		ProductRepository rep = new ProductRepository();


			Product[] productList = rep.getDetails();
		
		for(Product product : productList) {
			System.out.println(product);
		}






	}

	
	}
