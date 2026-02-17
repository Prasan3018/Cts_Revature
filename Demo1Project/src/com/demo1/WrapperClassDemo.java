package com.demo1;

public class WrapperClassDemo {
	public static void main(String[] args) {
		
		//by using constructor converting String/primitive to wrapper object
		Integer i = new Integer(10);
		System.out.println(i);
		
		//by using valueOf() converting String/primitive to the wrapper object
		Boolean b = Boolean.valueOf("true");
		System.out.println(b);
		
		//Example for toString()
		Integer i1 = new Integer(10);
		System.out.println(i1.toString());
		Float f1 = new Float(10.7);
		System.out.println(f1.toString());
		
		//XXXValue()
		Integer i2 = Integer.valueOf(150);
		System.out.println("byte value :"+i2.byteValue());
		System.out.println("short value :"+i2.shortValue());
		System.out.println("int value :"+i2.intValue());
		System.out.println("long value :"+i2.longValue());
		System.out.println("float value :"+i2.floatValue());
		
		//parseXXX()
		String str1="10";
		String str2="20";
		System.out.println(str1+str2);
		int a = Integer.parseInt(str1);
		float f2 = Float.parseFloat(str2);
		System.out.println(a+f2);
		
		//toString()
		Integer i3=new Integer(10);
		System.out.println(i3.toString());
		Float f3=new Float(10.7);
		System.out.println(f3.toString());
				
				
		String x1="890";
		int x2 =Integer.parseInt(x1);
		
		
	}
}
