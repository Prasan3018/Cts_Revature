package com.demo1;

class Vehicle
{
	void start() {
		System.out.println("Vehicle Started");
	}
}

class Car extends Vehicle{
	void openTrunk(){
		System.out.println("Car Trunk Opened");
	}
}

class Truck extends Vehicle{
	void loadCargo() {
		System.out.println("Truck is Ready to move with cargo");
	}
}

public class HierarchicalInheritance {
	
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.openTrunk();
		
		Truck truck = new Truck();
		truck.start();
		truck.loadCargo();
	}

}
