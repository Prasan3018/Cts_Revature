package com.demo1;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the years of experience : ");
		byte experience = scan.nextByte();
		
		System.out.println("enter the branch code : ");
		short branchCode = scan.nextShort();
		
		System.out.println("enter the jersey no : ");
		int jerseyNumber = scan.nextInt();
		
		System.out.println("enter the account number :");
		long accountNumber = scan.nextLong();
		
		System.out.println("enter the discount percentage :");
		float discountPercentage = scan.nextFloat();
		
		System.out.println("enter the salary :");
		double salary = scan.nextDouble();
		
		System.out.println("enter the grade (O,A,B,C) :");
		char grade = scan.next().charAt(0);
		
		System.out.println("enter the status for permanent employee :");
		boolean isPermanent = scan.nextBoolean();
		
		System.out.println("\n----Employee Details----");
		System.out.println("experience : " + experience);
		System.out.println("branchcode : " + branchCode);
		System.out.println("jerseynumber : " + jerseyNumber);
		System.out.println("acc numner :" + accountNumber);
		System.out.println("discount percentage : " + discountPercentage);
		System.out.println("salary : " + salary);
		System.out.println("grade : "+ grade);
		System.out.println("True or False :"+ isPermanent);		
		scan.close();
	}
}
