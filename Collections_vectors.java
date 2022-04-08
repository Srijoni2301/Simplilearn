package com.simplilearn;

import java.util.Vector;

public class Collections_vectors {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add("ramu");
		v.add(343.56);
		
		System.out.println("Vector contents are: "+v);
		
		v.remove(0);
		System.out.println("Vector contents are: "+v);
		
		v.remove(1);
		System.out.println("updated Vector contents are: "+v);
		
		Vector<Integer> v1 = new Vector<Integer>();  // this is using generics
		v1.add(10);
		v1.add(200);
		v1.add(300);
		
		System.out.println("Vector integer type  contents are: "+v1);
		
		v1.addAll(v);
		
		System.out.println("updated Vector contents are: "+v1);

	}

}
