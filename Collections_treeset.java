package com.simplilearn;

import java.util.TreeSet;

public class Collections_treeset {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(50);
		t.add(343);
		
		System.out.println("TreeSet contents are: "+t);
		
		t.remove(0);
		System.out.println("TreeSet contents are: "+t);
		
		t.remove(1);
		System.out.println("updated TreeSet contents are: "+t);
		
		TreeSet<Integer> t1 = new TreeSet<Integer>();  // this is using generics
		t1.add(10);
		t1.add(200);
		t1.add(300);
		
		System.out.println("TreeSet integer type  contents are: "+t1);
		
		t1.addAll(t);
		
		System.out.println("updated TreeSet contents are: "+t1);


	}

}
