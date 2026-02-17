package com.demo1;

public class CallByReference {
	
	public static void main(String[] args) {
		Ref name1 =new Ref("user1");
		Ref name2 =new Ref("user2");
		System.out.println("In the main function before calling swap :" + "\n name1="+name1.value+"\n name2="+name2.value);
		
		Swap(name1, name2);
		System.out.println("\nIn the main function after calling swap :" + "\n name1="+name1.value+"\n name2="+name2.value);
		
	}
	
	public static void Swap(Ref name1, Ref name2) {
		System.out.println(" \nIn the Swap method before swaping :" + "\n name1="+name1.value+"\n name2="+name2.value);
		
		String temp=name1.value;
		name1.value=name2.value;
		name2.value=temp;
		System.out.println(" \nIn the Swap method after swaping :" + "\n name1="+name1.value+"\n name2="+name2.value);
	}
	
	static class Ref{
		String value;
		Ref(String value)
		{
			this.value=value;
		}
	}
}
