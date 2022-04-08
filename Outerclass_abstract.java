package com.simplilearn;


//no object of abstract class
//but using anonymous inner types we can create the object of abstract class
// class which contains abstract methods and methods that can't be instantiated


abstract class AnonymousInnerClass{
	public abstract void display();
}

public class Outerclass_abstract {

	public static void main(String[] args) {
		//AnonymousInnerClass i1 = new AnonymousInnerClass();  // this will give error as "can't instantiate the abstract class"
		
		// but using anonymous inner types we can create the object of abstract class
		
		AnonymousInnerClass i = new AnonymousInnerClass() {
			public void display() {
				System.out.println("from the object of abstract class");
			}
		};
		i.display();
	}

}





