package com.demo1;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("enter the age : ");
	int age = scan.nextInt();
	switch(age) {
	case 13:
		System.out.println("Teen ager");
		break;
	case 18:
		System.out.println("eligible to drive car");
		break;
	case 21:
		System.out.println("eligible for work");
		break;
		
	default:
		System.out.println("Invalid age");
		break;
		
	}
	scan.close();
}
	
}
