package com.qa.java.collectiontest;

import java.util.ArrayList;

public class ProductService {


	public static void main(String args[]) {

		
		ProductRepository rep = new ProductRepository();

			String path = "C:\\\\Users\\\\omkar12381\\\\eclipse-workspace\\\\Exercise\\\\file.csv";
			//Product[] productList = rep.getDetails(path);
		
			ArrayList<Product> productList = rep.getDetails(path);
		for(Product product : productList) {
			System.out.println(product);
		}






	}

	
	}
