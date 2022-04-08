package com.simplilearn.string;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		
		for(int i=0; i<a.length; i++) //rows
		{
			for(int j=0; j<a[i].length; j++) //columns
			{
				System.out.println("enter the element: ");
				a[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i=0; i<a.length; i++) //rows
		{
			for(int j=0; j<a[i].length; j++) //columns
			{
				System.out.println("elements are: "+a[i][j]);
			}
		}
		
		sc.close();
		
	}

}


