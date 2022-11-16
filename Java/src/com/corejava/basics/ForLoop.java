package com.corejava.basics;

/*for(int i=0;i<3;i++) {
	System.out.println("Hi");
}*/

/*1
 *1 2
 *1 2 3
 */

public class ForLoop {

	public static void main(String[] args) {

		/*
		 * for(int i=1;i<=2;i++) { System.out.println("Hi"); }
		 */

		/*
		 * for(int i=1000; i>10; i--) {
		 * 
		 * System.out.print("The val of i is "); System.out.println(i); }
		 */

		int n = 6;

		boolean prime = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		System.out.println(prime);

	}
}

/*
 * Using for loop Intialization,Condition,Updation we can write in one line
 * 
 */
