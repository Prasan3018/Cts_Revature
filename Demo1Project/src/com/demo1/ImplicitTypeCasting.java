package com.demo1;

public class ImplicitTypeCasting {
	public static void main(String[] args) {
		int item = 10;
		double itemDouble = item;
		
		double pricePerItem = 70.50;
		double total = itemDouble * pricePerItem;
		
		System.out.println("Item :"+item);
		System.out.println("ItemDouble :"+itemDouble);
		System.out.println("Total bill :"+total);
	}
}
