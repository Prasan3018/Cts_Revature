package practice_java;

abstract class Vehiclez{
	abstract void speed();
	
	void brand() {
		System.out.println("High end brand");
	}
	
	
}

class Bikez extends Vehiclez{
	void speed() {
		System.out.println("bike speed is 50kmph");
	}
}

class Carz extends Vehiclez{
	void speed() {
		System.out.println("car speed is 100kmph");
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		
		Vehiclez c1 = new Carz();  // Superclass can also be used 
		c1.speed();
		
		Bikez b1 = new Bikez();
		b1.speed();
		
	}
}
