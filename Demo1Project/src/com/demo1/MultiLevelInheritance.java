package com.demo1;

import java.util.Scanner;

class User1
{
	String username;
	
	void login()
	{
		System.out.println(username + " is logged in ");
		}
}

class Employee1 extends User1
{
	int  id;
	String name;
	Scanner scan = new Scanner(System.in);
	void work() {
		System.out.println("enter the id of the employee :");
		id = scan.nextInt();
		scan.nextLine();
		System.out.println("enter the name of the employee :");
		name=scan.nextLine();
		System.out.println();
		}
}

public class MultiLevelInheritance {

}
