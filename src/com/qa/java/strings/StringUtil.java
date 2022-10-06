package com.qa.java.strings;

public class StringUtil {

	static int numberOfWords(String str) {

		return str.split(" ").length;

	}
	
	static int emailValidation(String[] st) {

		String s;
		int counter  = 0;
		

		for (String element : st) {

			if (element.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
				
				System.out.println("its a valid email ");
				counter++;
				

			}else {
				System.out.println("its an invalid email");
				
				
			}

		}
		System.out.println("total number of valid email ids are : "+ counter);

		return counter;

	}


	

	
	/*
	 * static boolean emailValidation(String[] st) {
	 * 
	 * String s;
	 * 
	 * 
	 * for (String element : st) {
	 * 
	 * if (element.matches(
	 * "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
	 * 
	 * System.out.println("its a valid email ");
	 * 
	 * }else { System.out.println("its an invalid email"); }
	 * 
	 * }
	 * 
	 * return true;
	 * 
	 * }
	 */
}
