package com.qa.java.exercises;

public class SumOfDigits {

	public static void main(String[] args) {

		int input = 1234;

		int sum = 0;

		int divisor = 10;

		if (input < divisor) {
			System.out.println("sum is : " + input);
		} else {

			boolean isSingleDigit = false;

			do {
				
				 if (input < divisor) {
					  isSingleDigit = true;
					  System.out.println("sum of the digits is  : "+sum);
				  
				  } 

				int remainder = input % divisor;

				int result = input / divisor;

				System.out.println("remainder is : " + remainder);
				System.out.println("remaining number is : " + result);

				input = result;
				sum = sum + remainder;
				System.out.println("now input is : " + input);
				System.out.println("sum till now : "+ sum);

			} while (isSingleDigit == false);

		}

		

	}

}
