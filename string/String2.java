package com.simplilearn.string;

public class String2 {

	public static void main(String[] args) 
	{
		
		
		//String Comparison : 
        //returns difference of the ASCII values of first unmatched characters
        //s1-s2 (s1(unmatched-char) - s2(unmatched-char))
        //         s1(l) - s2(d)
        //         108   - 100
        //         8
		
		
        String s1="Hello";//108
        String s2="Heldo";//100
        System.out.println(s1.compareTo(s2));//output : 8

	}

}

