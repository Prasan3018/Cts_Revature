package com.reflection.demo;

import java.lang.Class;
import java.lang.reflect.*;


public class ClassReflectionDemo {
	
	public static void main(String[] args) {
		try {
			// creating an object of dog
			Dog d1 = new Dog();
			
			
			//create an object of class
			//using getClass()
			class obj = d1.getClass();
			
			// getting name of the class
			String name = obj.getName();
			System.out.println("Name : "+name);
			
			// get the access modifier of the class
			int modifier = obj.getModifiers();
			
			// convert the access modifier to string
			String mod = Modifier.toString(modifier);
			System.out.println("Superclass : "+superClass.getName());
			
			}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
