package com.thread;

class MyClass extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getId() + " :Value " + i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class demo {
	public static void main(String args[]) {
		MyClass myClass = new MyClass();
		myClass.start();

		MyClass myClass1 = new MyClass();
		myClass1.start();
		
		MyClass myClass2 = new MyClass();
		myClass2.start();

		MyClass myClass3 = new MyClass();
		myClass3.start();
	}
}
