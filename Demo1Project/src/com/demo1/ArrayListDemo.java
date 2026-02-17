package com.demo1;

import java.util.ArrayList;

public class ArrayListDemo{
	
	public static void main(String[] args) {
		ArrayList al2=new ArrayList<>();
		al2.add("sample");
		al2.add(67);
		System.out.println("Al2 items are"+al2);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(300);
		al.add(new Integer(200));
		
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		
		System.out.println("Size of  al "+al.size());
		
		al.add(1,450);
		
		System.out.println("after al.add(1,450) ");
		System.out.println("Size of  al "+al.size());
		System.out.println(al);

		al.remove (new Integer (30));
		System.out.println("after al.remove (new Integer (30))");
		System.out.println (al);
		System.out.println (al.size ());
	
		al.remove (0);
		System.out.println("after al.remove (0)");
		System.out.println (al);
		
		
		for (int i = 0; i < al.size (); i++)
		{
		System.out.println (al.get (i));
		}


		
		for (int v:al)
		{
		System.out.println (v);
		}
		
	
		System.out.println (al.contains (50));
		
		ArrayList < Integer > al1 = new ArrayList < Integer > (al);
		System.out.println (al1);

	}
	}
