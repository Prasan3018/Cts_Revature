package com.demo1;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the student ID : ");
		
		byte stu_Id = scan.nextByte();
		System.out.println("enter the student Name : ");
		
		String stu_Name = scan.nextLine();
		System.out.println("enter the student Mark : ");
		
		short stu_Mark = scan.nextShort();
		System.out.println("enter the fee paid status (Yes/No):");
		
		boolean fee_Paid = scan.nextBoolean();
		
		System.out.println("Student Result based on mark :");
		
		if (stu_Mark >= 40 ) {
			System.out.println("Student Passed");
		}
		else {
			System.out.println("student failed");
		}
		
		
		System.out.println("Student Grade based on mark :");
		
		if (stu_Mark >= 85) {
			System.out.println("Grade : A");
		}
		else if (stu_Mark <=84 && stu_Mark >=70) {
			System.out.println("Grade : B");
		}
		else if (stu_Mark <=69 && stu_Mark >50) {
			System.out.println("Grade : C");
		}
		else{
			System.out.println("Grade : D");
		}
		
		scan.close();
		
	}
}
