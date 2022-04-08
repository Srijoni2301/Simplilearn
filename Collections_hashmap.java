package com.simplilearn;
import java.util.HashMap;
import java.util.TreeMap;

public class Collections_hashmap {

	public static void main(String[] args) {
		
		// HASHMAP
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "India");
		hashMap.put(2, "Indonasia");
		hashMap.put(3, "Imphal");
		
		System.out.println(hashMap);
		
		String res1 = hashMap.get(1);
		System.out.println(res1);
		
		
		//TREEMAP
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "India");
		treeMap.put(2, "Indonasia");
		treeMap.put(3, "Imphal");
		
		System.out.println(treeMap);
		
		String res2 = treeMap.get(2);
		System.out.println(res2);
	}

}
