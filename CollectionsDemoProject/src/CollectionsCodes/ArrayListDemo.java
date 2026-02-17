package CollectionsCodes;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a2 = new ArrayList<>();
		a2.add("sample");
		a2.add(18);
		System.out.println("a2 items are"+a2);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(300);
		a1.add(new Integer(200));
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		
		System.out.println("Size of a1 "+a1.size());
		
		a1.add(2,222);
		
		System.out.println("after a1.add(2,222) ");
		System.out.println("Size of a1 "+a1.size());
		System.out.println(a1);
		
		// modifying the element 
		
		
		
	}
}
