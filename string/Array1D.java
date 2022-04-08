package com.simplilearn.string;
import java.util.Scanner;

public class Array1D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		for(int i=0; i<5; i++) 
		{
			System.out.println("enter the element: ");
			a[i] = sc.nextInt();
		}
		
		for (int i=0; i<5; i++) 
		{
			System.out.println("elements of array a are: " + a[i]);
		}
		
		
		int b[] = {10,20,30,40,50};
		
		for(int i=0; i<5; i++)
		{
			System.out.println("elements of array b are: "+b[i]);
		}
		
		sc.close();

	}

}
