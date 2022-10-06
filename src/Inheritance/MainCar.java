package Inheritance;

public class MainCar {
	
	public static void main(String[] args) {
		
		Car car = new Car(10, "car123", 300000, "100cc", "diesel", 2012);
		car.displayCarDetails();
		
		
		Audi audi = new Audi(1, "audi100", 100000, "120cc", "petrol", 2021, "234", true);
		audi.displayAudiCarDetails();
		
		BMW bmw = new BMW(2, "bmw100",2000000, "130cc", "diesel", 2020, 112, 11);
		bmw.displayBMWcarDetails();
	}

}
