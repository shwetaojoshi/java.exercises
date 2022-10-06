package com.qa.java.inheritance;

public class BMW extends Car{
	
	int noOfCyinders ;
	int maxTorque ;
	
	
	
	
	public BMW(int id, String name, int price, String engineCC, String fuelType, int manufacturingYear,
			int noOfCyinders, int maxTorque) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.noOfCyinders = noOfCyinders;
		this.maxTorque = maxTorque;
	}




	void displayBMWcarDetails() {
		
		displayCarDetails();
		System.out.println("car's no of cylinders : "+noOfCyinders );
		System.out.println("car's maxtorque : "+ maxTorque);
	}

}
