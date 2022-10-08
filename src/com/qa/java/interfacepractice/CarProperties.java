package com.qa.java.interfacepractice;

public abstract class CarProperties {
	
	int id ;
	String name ; 
	int price;
	String engineCC;
	String fuelType;
	int manufacturingYear ;	
	
	
	public CarProperties(int id, String name, int price, String engineCC, String fuelType, int manufacturingYear) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manufacturingYear = manufacturingYear;
	}

}	