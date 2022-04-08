package com.simplilearn;

import java.util.ArrayList;

public class Collections_arraylist {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("ramu");
		al.add(343.56);
		
		System.out.println("arraylist contents are: "+al);
		
		al.remove(0);
		System.out.println("arraylist contents are: "+al);
		
		al.remove(1);
		System.out.println("updated arraylist contents are: "+al);
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();  // this is using generics
		al1.add(10);
		al1.add(200);
		al1.add(300);
		
		System.out.println("arraylist integer type  contents are: "+al1);
		
		al.addAll(al1);
		
		System.out.println("updated arraylist contents are: "+al);
		

	}

}
