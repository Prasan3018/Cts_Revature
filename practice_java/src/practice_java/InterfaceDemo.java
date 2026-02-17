package practice_java;

interface Animalu{
	int weight = 100;
	abstract void sound();
	
}
	
class Dogu implements Animalu{
	public void sound() {
		System.out.println("barkss");
	}
}


public class InterfaceDemo {
	public static void main(String[] args) {
		Dogu d1 = new Dogu();
		System.out.println(d1.weight);
	}

}
