package com.qa.java.arrays;

public class ArrayUtil {

	static int sum(int[] a) {
		int sum = 0;

		/*
		 * for (int i=0 ; i< a.length ; i++ ) { sum = sum+a[i];
		 * 
		 * }
		 */

		for (int element : a) {
			sum = sum + element;
		}

		System.out.println("sum of the numbers : " + sum);
		return sum;

	}

	static int minNumber(int a[]) {

		int min = a[0];

		for (int element : a) {
			if (min > element) {

				min = element;

			}
		}

		System.out.println("smallest number in an array is :" + min);
		return min;

	}

	static int maxNumber(int[] a) {
		int max = a[0];

		for (int element : a) {
			if (max < element) {

				max = element;
			}
		}

		System.out.println("highest numer in an array is :" + max);
		return max;

	}

	static Product getLeastPriceProduct(Product[] pro) {

		Product product = pro[0];
		float leastprice = pro[0].price;
		for (Product element : pro) {

			if (leastprice > element.price) {

				leastprice = element.price;
				product = element;

			}

		}
		return product;
		

	}
	
	
	static Product getHigestPriceProduct(Product[] pro) {

		Product product = pro[0];
		float highestPrice = pro[0].price;
		for (Product element : pro) {

			
			if (highestPrice < element.price) {

				highestPrice = element.price;
				product = element;

			}

		}
		return product;
		

	}
	
	
	static Product getHigestRatingProduct(Product[] pro) {

		Product product = pro[0];
		byte highestRating = pro[0].rating;
		for (Product element : pro) {

			
			if (highestRating < element.rating) {

				highestRating = element.rating;
				product = element;

			}

		}
		return product;
		

	}

}
