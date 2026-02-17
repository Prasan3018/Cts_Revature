package com.demo1;


public class GarbageCollection{
	 public void finalize()
	    {
	        System.out.println ("Garbage Collection performed by JVM");
	    }
	public static void main(String[] args) {
		GarbageCollection t1 = new GarbageCollection();
		GarbageCollection t2 = new GarbageCollection();
		System.out.println(t1);
		System.out.println(t2);
		
		t1 = null;// t1 object is eligible for Garbage collector
		t2 = null;// t2 object is eligible for Garbage Collector
		System.out.println(t1);
		System.out.println(t2);
		System.gc();
	}
}
