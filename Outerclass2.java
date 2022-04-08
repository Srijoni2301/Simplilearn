package com.simplilearn;

public class Outerclass2 {
	
	//1. create class
	//2. create obj of class
	//3. call method of the class
	
	
	private String msg= "Inner classes";
	
	void display() {
		class Inner{   // class inside method
			void msg() {
				System.out.println(msg);
			}
		}
		
		Inner i = new Inner();
		i.msg();
	}
	

	public static void main(String[] args) {
		Outerclass2 ob = new Outerclass2();
		ob.display();

	}

}
