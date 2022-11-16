package com.corejava.basics;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 * int num=1; while(num<=5) { //In While Loop condition is checked first
		 * System.out.println("Hi"); num++; }
		 */

		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);

		/*
		 * int i = 1; while (i <= 10) { System.out.println(i); i++; }
		 * 
		 * // In do While condition is checked at last | Definitely the loop will
		 * execute once weather the condition is true/false.| semicolon(;) is required
		 * in while loop
		 * 
		 * /* Intialization,Condition,Updation
		 */
	}
}
