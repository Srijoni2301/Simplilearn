package com.simplilearn.thread;

public class Exception_try_catch {

	public static void main(String[] args) {
		int [] array = new int[3];
		try
		{
			array[7]= 3;
		}
		catch (ArrayIndexOutOfBoundsException e)   //specific catch
		{
			System.out.println("Array index is out of bounds!");
		}
		catch(Exception e)                        //generic catch
		{
			System.out.println("Exception handled in generic catch");
		}
		finally
		{
			System.out.println("The array is of size:" + array.length);
		}
	}

}
