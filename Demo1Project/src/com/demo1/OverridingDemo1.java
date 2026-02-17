package com.demo1;

class Parent{
	void property() {
	System.out.println("water, food, clothes, shelter");
}

void marry() {
	System.out.println("arrange marriage");
}
}

class Child extends Parent{
	void marry() {
		System.out.println("love marriage");
	}
}

public class OverridingDemo1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.property();
		c.marry();
		Parent p = new Parent();
		p.property();
		p.marry();

		Parent p1 = new Child();
		p1.property();
		p1.marry();
		
		
	}

}
