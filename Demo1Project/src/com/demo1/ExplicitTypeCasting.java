package com.demo1;

public class ExplicitTypeCasting {
	public static void main(String[] args) {
		/*
		double distance = 18.45;
		int display = (int)distance;
		
		System.out.println("Actual distance :"+distance);
		*/
		
		char grade = 'A';
		int gradeCode = (int)grade;
		char backToChar = (char)gradeCode;
		
		System.out.println(gradeCode);
		System.out.println(backToChar);
	}
}
