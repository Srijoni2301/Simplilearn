package com.simplilearn.algo;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        //int[] arr = {10,20,30,40,50};
    	
    	//dynamic array input from user
    	Scanner sc = new Scanner(System.in);
    	
    	
    	System.out.println("enter the no. of elements of the array");
    	
    	int arr_size = sc.nextInt();
    	
    	int []arr = new int[arr_size];
    	System.out.println("enter elements of array");
    	for(int i=0; i<arr_size;i++) {
    		arr[i]=sc.nextInt();
    	}
    	
    	
    	
    	
        System.out.println("Enter the element to be searched");//40
        int searchValue = sc.nextInt(); //element to be searched
        
        int result = (int) linearing(arr,searchValue); //calling the method
        if(result==-1){
            System.out.println("Element not in the array");
        } else {
            System.out.println("Element found at "+result+" and the search key is "+arr[result]);
        }
        
        sc.close();
    }
    public static int linearing(int arr[], int x) {
        int arrlength = arr.length;
        for (int i = 0; i < arrlength; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}