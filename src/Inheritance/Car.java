package Inheritance;

public class Car {
	
	int id ;
	String name ; 
	int price;
	String engineCC;
	String fuelType;
	int manufacturingYear ;
	
	
	
	
	public Car(int id, String name, int price, String engineCC, String fuelType, int manufacturingYear) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manufacturingYear = manufacturingYear;
	}




	void displayCarDetails() {
		System.out.println("car's id is : "+id );
		System.out.println("car's name is : "+ name);
		System.out.println("car's price is : "+price );
		System.out.println("car's engineCC is : "+engineCC );
		System.out.println("car's manufacturing year is : "+ manufacturingYear);
	}

}
