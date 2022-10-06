package Inheritance;

public class Audi extends Car {
	
	String model ;
	boolean isAvailable;	

	

	void displayAudiCarDetails() {
		displayCarDetails();
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
