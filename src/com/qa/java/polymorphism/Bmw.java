package com.qa.java.polymorphism;

public class Bmw extends Car{

	int noOfCyinders ;
	int maxTorque ;
	
	
	
	
	public Bmw(int id, String name, int price, String engineCC, String fuelType, int manufacturingYear,
			int noOfCyinders, int maxTorque) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.noOfCyinders = noOfCyinders;
		this.maxTorque = maxTorque;
	}




	void displayCarDetails() {   //overridden method
		
		super.displayCarDetails();  //calling method from parent class
		System.out.println("car's no of cylinders : "+noOfCyinders );
		System.out.println("car's maxtorque : "+ maxTorque);
	}


}
