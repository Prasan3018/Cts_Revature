package practice_java;

class Animal{
	void eat() {
		System.out.println("animal eats");
	}
}

class Dog extends Animal{
	void barks() {
		System.out.println("dog barks");
	}
}

public class SingleInhertitance {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.eat();
//		System.out.println();
	}

}
