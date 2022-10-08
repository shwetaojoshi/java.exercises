package com.qa.java.interfacepractice;

public class Audi extends CarProperties implements ICar {

	String model;
	boolean isAvailable;

	public Audi(int id, String name, int price, String engineCC, String fuelType, int manufacturingYear, String model,
			boolean isAvailable) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.model = model;
		this.isAvailable = isAvailable;
	}

	@Override
	public void displayCarDetails() {
		System.out.println("car's name is : " + name);
		System.out.println("car's price is : " + price);
		System.out.println("car's engineCC is : " + engineCC);
		System.out.println("car's manufacturing year is : " + manufacturingYear);
		System.out.println("car's model is : " + model);
		System.out.println("car's availability : " + isAvailable);
	}

}
