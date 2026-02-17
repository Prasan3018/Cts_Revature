package practice_java;

class Grandfather{
	void house() {
		System.out.println("house is the property");
	}
}

class Father extends Grandfather{
	void money() {
		System.out.println("money is the property");
	}
}

class Son extends Grandfather{
	void take() {
		System.out.println("takes the property");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Son s1 = new Son();
		s1.house();
		Father f1 = new Father();
		f1.house();
	}

}
