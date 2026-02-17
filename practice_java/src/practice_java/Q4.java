package practice_java;

class Counter{
	static int count = 0;
	
	int instanceNumber = 0;
	
	Counter(){
		count = count + 1;
		instanceNumber = instanceNumber + 1;
	}
	
	void display() {
		System.out.println("InstanceNumber : "+ instanceNumber);
		System.out.println("count : "+count);
	}
	
	
}

public class Q4 {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		c1.display();
		Counter c2 = new Counter();
		c2.display();
		Counter c3 = new Counter();
		c3.display();
		
	}

}
