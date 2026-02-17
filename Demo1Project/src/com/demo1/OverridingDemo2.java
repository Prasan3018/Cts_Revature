package com.demo1;

class Payment{
	void pay(double amount) {
		System.out.println("Processing generic payment of $" + amount);
	}
}

class Creditcard extends Payment{
	void pay(double amount) {
		System.out.println("Processing generic payment of $" + amount);
		System.out.println("steps : validate card --> Ask OTP --> Deduct amount");
	}
}

class UPI extends Payment{
	void pay(double amount) {
		System.out.println("Processing generic payment of $" + amount);
		System.out.println("steps : verify UPI ID --> Enter pin --> Transfer amount");
	}
}

class CashOnDelivery extends Payment{
	void pay(double amount) {
		System.out.println("Processing generic payment of $" + amount);
		System.out.println("steps : deliver item --> collect cash");
	}
}

public class OverridingDemo2 {
	public static void main(String[] args) {
		Payment p1 = new Creditcard();
		p1.pay(3000);
		
		System.out.println("----------------");
		
		Payment p2 = new UPI();
		p2.pay(1000);
		
		System.out.println("----------------");
		
		Payment p3 = new CashOnDelivery();
		p3.pay(500);
		
		
	}
}
