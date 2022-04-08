package com.simplilearn;

// write a program which will take a string as input and will
// convert it into other data types.

public class Typecasting {

	public static void main(String[] args) {
		int a;
		byte b = 20;
		
		//implicit conversion
		a=b;
		
		//explicit conversion
		int a1 = 230;
		long l1 = 0;
		
		a1 = (int)l1;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a1);
		System.out.println(l1);
	}

}
