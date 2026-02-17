package practice_java;

class Animals{
	String name;
	int age;
	
	void makeSound() {
		System.out.println("Animal makes sound");
	}
	
}

class Dogs extends Animals{
	String breed;
	
	void makeSound() {
		System.out.println("Dog barks");
	}
	
	void fetch() {
		System.out.println("dog is fetching");
	}
}

class Cats extends Animals{
	String color;
	
	@Override
	void makeSound() {
		System.out.println("cat says meow");
	}
	
	void climb(){
		System.out.println("cat is climbing");
	}
}

public class AnimalKingdom {
	
	public static void main(String[] args) {
		Dogs d1 = new Dogs();
		d1.name = "tommy";
		d1.age = 8;
		d1.breed = "local";
		d1.makeSound();
		d1.fetch();
		
		Cats c1 = new Cats();
		c1.name = "jd";
		c1.age = 5;
		c1.color = "brown";
		c1.makeSound();
		c1.climb();
		
	
	
	}

}
