package com.simplilearn;


import java.util.LinkedList;

public class Collections_linkedlist {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("ramu");
		l.add(343.56);
		
		System.out.println("Linkedlist contents are: "+l);
		
		l.remove(0);
		System.out.println("Linkedlist contents are: "+l);
		
		l.remove(1);
		System.out.println("updated Linkedlist contents are: "+l);
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();  // this is using generics
		l1.add(10);
		l1.add(200);
		l1.add(300);
		
		System.out.println("Linkedlist integer type  contents are: "+l1);
		
		l.addAll(l1);
		
		System.out.println("updated Linkedlist contents are: "+l);
		

	}

}
