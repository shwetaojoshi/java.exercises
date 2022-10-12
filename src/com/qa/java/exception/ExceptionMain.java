package com.qa.java.exception;

import com.qa.java.oop.Product;

public class ExceptionMain {

	public static void main(String[] args) {

		ExceptionUtil exceptionUtil = new ExceptionUtil();
		try {

			exceptionUtil.division(100, 0);

		} catch (ArithmeticException e) {
			System.out.println("number should not be zero");
		}
		Product product1 = null;

		
		try {
			exceptionUtil.getProductDetails(product1);

		} catch (NullPointerException ex) {
			System.out.println("product should not be Null");
		}

		try {
			exceptionUtil.getProductById(111);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		/*
		 * }catch (ProductNotFoundException e){ System.out.println(e.getMessage());
		 * 
		 * //System.out.println("product not found");
		 * 
		 * }
		 */

	}

}
