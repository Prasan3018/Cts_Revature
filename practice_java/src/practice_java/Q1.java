package practice_java;

class Vehicle{
	String brand;
	int Year;
	
	void startEngine() {
		System.out.println("starts....");
	}
}

class Car extends Vehicle{
	String fuelType;
	
	void startEngine() {
		System.out.println("car engine starts..");
	}
	
	void drive() {
		System.out.println("car is driving");
	}
}

class Truck extends Vehicle{
	byte loadCapacity;
	
	void startEngine() {
		System.out.println("Truck engine started");
	}
	
	void haul() {
		System.out.println("truck is hauling");
	}
}
public class Q1 {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.brand = "audi";
		c1.fuelType = "petrol";
		c1.Year = 2026;
		c1.startEngine();
		c1.drive();
		
		Truck t1 = new Truck();
		System.out.println(t1.brand = "euro");
		t1.Year = 1986;
		t1.loadCapacity = 5;
		t1.startEngine();
		t1.haul();
		
	}

}
