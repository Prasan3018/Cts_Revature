package com.demo1;

public class MethodDemo1 {
	public int max(int num1, int num2)
	{
		if (num1>num2)
			return num1;
		else
			return num2;
	}
	
	public static void main(String[] args) {
		MethodDemo1 methodDemo1 = new MethodDemo1();
		int maxValue = methodDemo1.max(500,1000);
		System.out.println("Maximum value is : " + maxValue);
	}
}
