package com.qa.java.exercises;

public class DataTypes {
	
	public static void main(String[] args) {
		
		float Apple = 3.25f; 
		float chikenFillet = 7.25f;
		float banana = 1.25f;
		
		float discountPriceforApple = Apple*10/100;
		float discountPriceforchiken = Apple*8/100;
		float discountPriceforBanana = Apple*3/100;
		
		
		
		float finalPriceforApple = (Apple -discountPriceforApple );
		float finalPriceforChiken = (chikenFillet - discountPriceforchiken) ;
		float finalPriceforBanana =(banana-discountPriceforBanana) ;
		
		System.out.println("final price for Apple after Discount is:" + finalPriceforApple);
		System.out.println("final price for chicken after Discount is:" + finalPriceforChiken);
		System.out.println("final price for banana after Discount is: " + finalPriceforBanana);
		
		
		}

}
