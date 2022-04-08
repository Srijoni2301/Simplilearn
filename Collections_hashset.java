package com.simplilearn;

import java.util.HashSet;


public class Collections_hashset {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(10);
		h.add(50);
		h.add(343);
		
		System.out.println("HashSet contents are: "+h);
		
		h.remove(0);
		System.out.println("HashSet contents are: "+h);
		
		h.remove(1);
		System.out.println("updated HashSet contents are: "+h);
		
		HashSet<Integer> h1 = new HashSet<Integer>();  // this is using generics
		h1.add(10);
		h1.add(200);
		h1.add(300);
		
		System.out.println("HashSet integer type  contents are: "+h1);
		
		h1.addAll(h);
		
		System.out.println("updated HashSet contents are: "+h1);


	}

}
