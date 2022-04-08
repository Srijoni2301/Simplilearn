package com.simplilearn.thread;
import java.util.Scanner;

//-------------------THROWS KEYWORD---------------------

class Set1{
	void display1() throws ArithmeticException {
		Scanner sc = new Scanner(System.in);
		System.out.println("arithmetic activity starts");
		System.out.println("enter the value 1:");
		int val_1 = sc.nextInt();
		
		System.out.println("enter the value 2:");
		int val_2 = sc.nextInt();
		
		
		int res = val_1/val_2;  //critical st.
		System.out.println(res);
		System.out.println("arithmetic activity ends");
	}
}

class Set2{
	void display2() throws ArithmeticException {
		Set1 s1 = new Set1();
		s1.display1();
	}
}

class Set3{
	void display3() throws ArithmeticException{
		Set2 s2 = new Set2();
		s2.display2();
	}
	
}

public class TryCatchExpExample4 {

	public static void main(String[] args) {
		Set3 s3 = new Set3();
		try {
			s3.display3();
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled in main ");
		}

	}

}
