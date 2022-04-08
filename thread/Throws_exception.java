package com.simplilearn.thread;

class Code{
	void opr() throws ArithmeticException  //ducking of exception
	{
		int a = 45, b=0, rs;
		
		if(b==0)
			throw(new ArithmeticException("Can't divide by zero"));
		else
		{
			rs = a/b;
			System.out.println("The result is: "+rs);
		}
		System.out.println("End of program");
	}
}

public class Throws_exception {

	public static void main(String[] args) {
		
		Code c = new Code();
		try {
			c.opr();
		}
		catch(ArithmeticException Ex)
		{
			System.out.println("Error: "+Ex.getMessage());
		}

	}

}
