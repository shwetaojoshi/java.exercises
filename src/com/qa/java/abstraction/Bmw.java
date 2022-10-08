package com.qa.java.abstraction;

public class Bmw extends Car{

	int noOfCyinders ;
	int maxTorque ;
	
	
	
	
	public Bmw(int id, String name, int price, String engineCC, String fuelType, int manufacturingYear,
			int noOfCyinders, int maxTorque) {
		super(id, name, price, engineCC, fuelType, manufacturingYear);
		this.noOfCyinders = noOfCyinders;
		this.maxTorque = maxTorque;
	}




	void displayCarDetails() {   //  implementing the abstarct methods from parent class 
		
		System.out.println("car's id is : "+id );
		System.out.println("car's name is : "+ name);
		System.out.println("car's price is : "+price );
		System.out.println("car's engineCC is : "+engineCC );
		System.out.println("car's manufacturing year is : "+ manufacturingYear);
		System.out.println("car's no of cylinders : "+noOfCyinders );
		System.out.println("car's maxtorque : "+ maxTorque);
	}


}
