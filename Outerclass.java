package com.simplilearn;

public class Outerclass {
	private String msg = "Welcome to JAVA"; //instance var of class -> inner class
	
	class Innerclass{
		void hello() {
			System.out.println(msg+ ", lets start");
		}
	}

	public static void main(String[] args) {
		Outerclass obj = new Outerclass();
		Outerclass.Innerclass in = obj.new Innerclass(); // new object inside existing object to fetch the private String
		in.hello();
		
		
		//1. create object of outer class
		//2. create ref. of inner class by using outer class
		//3. create object of inner class using the object handle of outer class
	}

}
