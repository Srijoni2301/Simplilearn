package com.simplilearn.thread;

class Thrd2 implements Runnable{  
	public void run() {   //this run() is compulsory
		System.out.println("inside thread created from runnable interface");
	}
}

public class Thread2 {

	public static void main(String[] args) {
		Thrd2 t2 = new Thrd2();
		Thread t = new Thread(t2);
		t.start();
	}

}
