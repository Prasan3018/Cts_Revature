package com.demo1;

class Father{
	void m1() {
		System.out.println("parent class method");
	}
}

class Son extends Father{
	void m1() {
		System.out.println("child class method m1");
	}

	void m2() {
		this.m1();
		System.out.println("child class method m2");
		super.m1();
	}

}

public class SuperKeyword {
	public static void main(String[] args) {
		Son c = new Son();
		c.m2();
	}
}