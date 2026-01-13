package com.demo1;

import java.util.Scanner;

public class JavaAssignment1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the student ID : ");
		byte stu_Id = scan.nextByte();

		scan.nextLine();

		System.out.println("enter the student Name : ");
		String stu_Name = scan.nextLine();

		System.out.println("enter the student Mark : ");
		short stu_Mark = scan.nextShort();

		scan.nextLine(); 

		System.out.println("enter the fee paid status (Yes/No):");
		String fee_Status = scan.nextLine();

		boolean fee_Paid;
		if (fee_Status.equalsIgnoreCase("Yes")) {
			fee_Paid = true;
		} else {
			fee_Paid = false;
		}

		System.out.println("Student Result based on mark :");

		String result;

		if (stu_Mark >= 40) {
			System.out.println("Student Passed");
			result = "Passed";
		} else {
			System.out.println("Student Failed");
			result = "Failed";
		}

		System.out.println("Student Grade based on mark :");

		char grade;

		if (stu_Mark >= 85) {
			System.out.println("Grade : A");
			grade = 'A';
		} else if (stu_Mark <= 84 && stu_Mark >= 70) {
			System.out.println("Grade : B");
			grade = 'B';
		} else if (stu_Mark <= 69 && stu_Mark >= 50) {
			System.out.println("Grade : C");
			grade = 'C';
		} else {
			System.out.println("Grade : D");
			grade = 'D';
		}

		System.out.println("Certificate Eligibility :");

		String certificate_Status;

		if (stu_Mark >= 40 && fee_Paid == true) {
			System.out.println("Eligible for Certificate");
			certificate_Status = "Eligible";
		} else {
			System.out.println("Not Eligible for Certificate");
			certificate_Status = "Not Eligible";
		}

		System.out.println("Course Allocation :");

		String course;

		switch (grade) {
		case 'A':
			System.out.println("Course : Data Science");
			course = "Data Science";
			break;

		case 'B':
			System.out.println("Course : Java Full Stack");
			course = "Java Full Stack";
			break;

		case 'C':
			System.out.println("Course : Web Development");
			course = "Web Development";
			break;

		case 'D':
			System.out.println("Course : Basic Programming");
			course = "Basic Programming";
			break;

		default:
			System.out.println("Course : Counseling");
			course = "Counseling";
		}

		System.out.println("\nFinal Student Summary :");
		System.out.println("Student ID : " + stu_Id);
		System.out.println("Student Name : " + stu_Name);
		System.out.println("Student Marks : " + stu_Mark);
		System.out.println("Pass/Fail : " + result);
		System.out.println("Grade : " + grade);
		System.out.println("Fee Paid Status : " + (fee_Paid ? "Yes" : "No"));
		System.out.println("Certificate Status : " + certificate_Status);
		System.out.println("Allocated Course : " + course);

		scan.close();
	}
}
}
	
	


