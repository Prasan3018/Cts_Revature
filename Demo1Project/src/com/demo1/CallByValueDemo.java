package com.demo1;

public class CallByValueDemo {
	
	public static void main(String[] args) {
		String name1 = "user1";
		String name2 = "user2";
		System.out.println("In the main function before calling swap :" + "\n name1="+name1+"\n name2="+name2);
		
		Swap(name1, name2);
		System.out.println("\nIn the main function after calling swap :" + "\n name1="+name1+"\n name2="+name2);
		
	}
	
	public static void Swap(String name1, String name2) {
		System.out.println(" \nIn the Swap method before swaping :" + "\n name1="+name1+"\n name2="+name2);
		
		String temp=name1;
		name1=name2;
		name2=temp;
		System.out.println(" \nIn the Swap method after swaping :" + "\n name1="+name1+"\n name2="+name2);
	}
}
