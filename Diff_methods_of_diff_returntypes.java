package com.simplilearn;

class Diff_methods {
	
	void method1() 
	{
		System.out.println("this is void ");
	}
	
	int method2(int a, int b) 
	{
		System.out.println("this is int");
		return (a+b);
	}
	
	float method3(float a, float b) 
	{
		System.out.println("this is float");
		return (a*b);
	}
	
	String method4() 
	{
		System.out.println("this is a string");
		String a = "apple";
		return (a);
	}
}
public class Diff_methods_of_diff_returntypes{
	public static void main(String[] args) {
		Diff_methods m = new Diff_methods();
		
		m.method1();
		
		int result2 = m.method2(2, 5);
		System.out.println(result2);
		
		float result3 = m.method3(2.0f, 5.0f);
		System.out.println(result3);
		
		m.method4();
		
	}

}
	

