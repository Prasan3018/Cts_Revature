package practice_java;

class Lion{
	void eat() {
		System.out.println("lion eats");
	}
}

class Tiger extends Lion {
	void bark() {
	System.out.println("Tiger fights");
}
}

class Puppy extends Tiger{
	void weep() {
		System.out.println("puppy weeps");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Puppy pup = new Puppy();
		pup.weep();
		pup.bark();
		pup.eat();
	}

}
