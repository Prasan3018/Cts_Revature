package com.demo1;

class Employee1{
	int employeeId;
	String name;
	String designation;
	
	//parameterless or default constructor
	public Employee1() {
		System.out.println("constructor called");
	}
	
	//parameterised constructor
	public Employee1(int id, String name, String designation) {
		this.employeeId=id;
		this.name = name;
		this.designation=designation;
	}
	
	//copy constructor
	public Employee1(Employee1 emp)
	{
		this.employeeId=emp.employeeId;
		this.name=emp.name;
		this.designation=emp.designation;
		System.out.println("Copy Constructor called");
	}
	public void printEmployeeInfo()
	{
		this.designation="CEO";
		this.employeeId=101;
		this.name="virat";
		System.out.println("Employee Details are \n -----------");
		System.out.println("Id :"+employeeId);
		System.out.println("Name :"+name);
		System.out.println("Designation :"+designation);
	}
}


public class ClassandObjects {
	
	public static void main(String[] args) {
		Employee1 employee1 = new Employee1();
		employee1.printEmployeeInfo();
		
		Employee1 employee2 = new Employee1(1001,"prasan","developer");
		employee2.printEmployeeInfo();
		
		Employee1 employee3= new Employee1(1002,"virat","Team Lead");
		employee3.printEmployeeInfo();
		
		Employee1 employee4 = new Employee1(employee3);
		employee4.printEmployeeInfo();
		
		
	}
}
