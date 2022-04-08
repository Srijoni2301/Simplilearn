package com.simplilearn.thread;

class Thrd1 extends Thread {
	public void run() {   //this run() is not compulsory
		System.out.println("inside thread created from thread class");
	}
}

public class Thread1 {
	public static void main(String[] args) {
		Thrd1 t1 = new Thrd1();
		t1.start();         //thread is assigned to threads scheduler
							//thread scheduler will check and execute the run()

	}

}
