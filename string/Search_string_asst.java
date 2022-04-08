package com.simplilearn.string;
import java.util.Scanner;

public class Search_string_asst {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[4];
		System.out.println("Please enter strings");
		
		for (int i = 0; i < arr.length; i++) 
		{
	        arr[i] = sc.nextLine();
	    }
		
		System.out.println("Please enter string to be searched: ");
		String arr1 = new String();
		arr1 = sc.nextLine();
		
		boolean result = false;
		
		for(int i=0; i < arr.length; i++) 
		{
			if(arr1.equals(arr[i])) 
			{
				result = true;
			}
		}
		System.out.println(result);
		
		sc.close();
		
	}

}
