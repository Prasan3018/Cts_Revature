package com.demo1;

public class ExceptionDemo {
	public static void main(String[] args) {
//		int a = 18;
//		int b = 0;
//		System.out.println("The value of a is : "+a);
//		System.out.println("The value of b is : "+b);
//		int c = a/b;
//		System.out.println("The value of c is :"+c);
//	}

	// Arithmetic Exception
	
//	try {
//		int a = 18;
//		int b = 2;
//		System.out.println("The value of a is : "+a);
//		System.out.println("The value of b is : "+b);
//		int c = a/b;
//		System.out.println("The value of c is :"+c);
//	}
//	catch (ArithmeticException e){
//		System.out.println("cannot divide by 0");
//	}
	
	// NullPointerException
	try {
		String customerName = null;
		System.out.println(customerName.length());
	}
//	catch (NullPointerException e) {
//		System.out.println("customer name is missing (null)");
//	}
	
	// Exception to handle all the errors
	
	catch (Exception e) {
		System.out.println("This error has been occured : "+e);
	}
	}
}
