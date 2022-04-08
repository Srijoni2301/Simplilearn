package com.simplilearn.thread;
import java.util.Scanner;

//-----------------SPECIFIC AND GENERIC TRY-CATCH---------------

class Data1{
	void disp() {
		System.out.println("Data from disp");
	}
}

public class TryCatchExpExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Array activity starts");
			System.out.println("enter the size of array?");
			
			int arr_size = sc.nextInt();
			int arr[] = new int [arr_size]; //dynamic mem alloc for arrays
			
			System.out.println("enter the position where the element has to be stored");
			
			int arr_pos = sc.nextInt();
			
			System.out.println("enter element to insert");
			
			int arr_ele = sc.nextInt();
			
			arr[arr_pos] = arr_ele;  //assigning the element at its position
			System.out.println("Array activity ends");
			
			
			
			System.out.println("Object activity starts");
			Data1 d = new Data1();
			d.disp(); //critical st.
			//d =null;
			
			System.out.println("object activity ends");
			
			
			System.out.println("arithmetic activity starts");
			System.out.println("enter the value 1:");
			int val_1 = sc.nextInt();
			
			System.out.println("enter the value 2:");
			int val_2 = sc.nextInt();
			
			
			int res = val_1/val_2;  //critical st.
			System.out.println(res);
			System.out.println("arithmetic activity ends");
		}
		catch(ArithmeticException e1) {
			System.out.println("ArithmeticException handled !");
		}
		
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("ArrayIndexOutOfBoundException handled !");
		}
		
		catch(NullPointerException e3) {
			System.out.println("NullPointerException handled !");
		}
		
		catch(Exception e) {
			System.out.println("Exception handled !");
		}
	}

}
