package practice_java;

class Laptop{
	String name = "HP";
}

class Bike extends Laptop{
	int price = 250000;
}



public class MainClass {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		Bike b1 = new Bike();
		System.out.println(l1.name);
		System.out.println(b1.price);
		System.out.println(b1.name);
		
	}
}
