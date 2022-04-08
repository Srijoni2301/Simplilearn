package com.simplilearn.thread;

public class ThrowException {

	public static void main(String[] args) {
		int a = 45; int b = 0;
		int rs;
		
		try
		{
			if(b==0)
				throw(new ArithmeticException("Can't divide by zero"));
			else
			{
				rs = a/b;
				System.out.println("The result is: "+rs);
			}
		}
		catch(ArithmeticException Ex)
		{
			System.out.println("Error: "+Ex.getMessage());
		}
	}
}
