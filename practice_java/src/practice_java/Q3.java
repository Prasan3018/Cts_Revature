package practice_java;

class Person{
	public String name;
	
	protected int age;
	
	private int socialSecurityNumber;
	
	String address;
	
	Person(String name, int age, int socialSecurityNumber, String address ){
		this.name = name;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
		this.address = address;
	}
}

class Employee extends Person{
	
	Employee(String name, int age, int socialSecurityNumber, String address ){
		super(name, age, socialSecurityNumber, address);
		System.out.println("hyyy");
	}
	
}

public class Q3 {
	public static void main(String[] args) {
		Employee e1 = new Employee("virat", 37, 18012026, "bangalore");
		System.out.println(e1.name);
		System.out.println(e1.age);
//		System.out.println(e1.socialSecurityNumber);
		System.out.println(e1.address);
		
	}

}
