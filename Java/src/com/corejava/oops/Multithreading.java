package com.corejava.oops;

// Thread --> Unit of Process

class Hi extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Balaji");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

class Hello extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println("chakali");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hi obj1 = new Hi();
		Hello obj2 = new Hello();

		Thread t1 = new Thread();
		Thread t2 = new Thread();

		obj1.start();
		try {
			Thread.sleep(20);
		} catch (Exception e) {
		}
		obj2.start();

	}

}
