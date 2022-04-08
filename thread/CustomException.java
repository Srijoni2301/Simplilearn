package com.simplilearn.thread;

/*
 * question: 
 * Create a custom exp. called as OverAgeExp and UnderAgeExcep and give suitable msg to it.
 * Collect the inputs as age of the candidate and verify the criteria accordingly
 * 
 * if age>65--> overageexp must be thrown and its msg must be shown
 * if age<18 --> underageexp must be thrown and its msg must be shown
 * 
 * else print the msg as suitable for allotting the driving license.

*/


import java.util.Scanner;


class OverAgeException extends Exception{
	public String toString() {
		return "Age is over the limit";
	}
	String msg; //declaration of msg variable of string type
	public OverAgeException(String s) {
		msg = s;
	}
	
}

class UnderAgeException extends Exception{
	public String toString() {
		return "Age is under the limit";
	}
	String msg; //declaration of msg variable of string type
	public UnderAgeException(String s) {
		msg = s;
	}
}

public class CustomException {

	public static void main(String[] args) {
		System.out.println("enter age for getting driving license registration");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age < 0) {
			System.out.println("Enter a valid age");
		}
		
		else if(age > 0 && age < 18){
			UnderAgeException u = new UnderAgeException("Age is under the limit");
			System.out.println(u.toString());
		}
			
		else if(age > 60){
			OverAgeException o = new OverAgeException("Age should be below 60");
			
			System.out.println(o.toString());
		}
	
		else {
			System.out.println("Candidate is eligible !");
		}
		
	}

}
