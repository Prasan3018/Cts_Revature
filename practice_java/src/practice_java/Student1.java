//constructor with parameters

package practice_java;

public class Student1 {
	int marks;
	String name;
	
	Student1(){
		System.out.println("empty constructor called");
	}
	
	Student1(String a){
		System.out.println(a);
		System.out.println("kohli");
	}
	
	public static void main(String[] args) {
		Student1 s1 = new Student1("virat");
		Student1 s2 = new Student1();

	}
}
