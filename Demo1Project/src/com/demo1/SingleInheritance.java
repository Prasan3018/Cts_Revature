package com.demo1;

import java.util.Scanner;

class Employee
{
	int id;
	String name;
	Scanner scan = new Scanner(System.in);
	
	void work() {
		System.out.println("enter the id of the employee :");
		id = scan.nextInt();
		scan.nextLine();
		System.out.println("enter the name of the employee :");
		name = scan.nextLine();
		System.out.println(name + "is on duty");
		scan.close();
		}
}

class Manager extends Employee{
	void approveLeave() {
		System.out.println(name + " approved leave");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.work();
		manager.approveLeave();
	}

}
