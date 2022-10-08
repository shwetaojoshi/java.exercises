package com.qa.java.abstraction;



public class MainCar {
	
	public static void main(String[] args) {
		
		
		Audi audi = new Audi(1, "audi100", 100000, "120cc", "petrol", 2021, "234", true);
		CarService.displayCarDetails(audi);
		
		Bmw bmw = new Bmw(2, "bmw100",2000000, "130cc", "diesel", 2020, 112, 11);
		CarService.displayCarDetails(bmw);
		
		
	}

}
