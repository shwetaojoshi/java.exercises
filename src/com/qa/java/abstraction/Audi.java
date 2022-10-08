package com.qa.java.abstraction;

public class Audi extends Car {

	String model ;
	boolean isAvailable;	

	

	void displayCarDetails() {   // implementing the abstarct methods from parent class 
		System.out.println("car's id is : "+id );
		System.out.println("car's name is : "+ name);
		System.out.println("car's price is : "+price );
		System.out.println("car's engineCC is : "+engineCC );
		System.out.println("car's manufacturing year is : "+ manufacturingYear);
		System.out.println("car's model is : " + model);
		System.out.println("car's availability : " + isAvailable);
		
	}
	
	

	public Audi(int id, String name, int price, String engineCC, String fuelType, int manufacturingYear, String model,
			boolean isAvailable) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.model = model;
		this.isAvailable = isAvailable;
	}


}
