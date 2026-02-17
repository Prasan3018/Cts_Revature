//constructor

package practice_java;

public class Student {
	
	int marks;
	String name;
	
	Student(){
		System.out.println("constructor called");
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.marks);
	}
}
