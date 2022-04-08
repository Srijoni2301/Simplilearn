package com.simplilearn;
import java.util.PriorityQueue;

public class Collections_priorityqueue {

	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		p.add(10);
		p.add(50);
		p.add(343);
		
		System.out.println("PriorityQueue contents are: "+p);
		
		p.remove(0);
		System.out.println("PriorityQueue contents are: "+p);
		
		p.remove(1);
		System.out.println("updated PriorityQueue contents are: "+p);
		
		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();  // this is using generics
		p1.add(10);
		p1.add(200);
		p1.add(300);
		
		System.out.println("PriorityQueue integer type  contents are: "+p1);
		
		p1.addAll(p);
		
		System.out.println("updated PriorityQueue contents are: "+p1);


	}

}
