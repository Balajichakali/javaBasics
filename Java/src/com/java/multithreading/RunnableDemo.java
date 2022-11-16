package com.java.multithreading;

class Hi implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("HAPPY BIRTHDAY");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			}
		}
	}
}

class Hello implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("KING KOHLI");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			}
		}

	}
}

public class RunnableDemo {

	public static void main(String[] args) {

		Runnable objHi = new Hi();
		Runnable objHello = new Hello();

		Thread t1 = new Thread(objHi);
		Thread t2 = new Thread(objHello);

		t1.start();
		t2.start();

	}

}
