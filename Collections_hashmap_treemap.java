package com.simplilearn;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class Collections_hashmap_treemap {

	public static void main(String[] args) {
		
		//HASHMAP
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "Tim");
		h.put(2,"Marry");
		h.put(3,"catie");
		
		System.out.println(h);
		
		System.out.println("\n The elements in Hashmap are: ");
		for(Map.Entry i:h.entrySet()) 
		{
			System.out.println(i.getKey()+ " "+ i.getValue());
		}
		
		
		//TREEMAP
		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		t.put(1, "Tim");
		t.put(2,"Marry");
		t.put(3,"catie");
		
		System.out.println(t);
		
		System.out.println("\n The elements in TreeMap are: ");
		for(Map.Entry i:h.entrySet()) 
		{
			System.out.println(i.getKey()+ " "+ i.getValue());
		}
		
	}

}



