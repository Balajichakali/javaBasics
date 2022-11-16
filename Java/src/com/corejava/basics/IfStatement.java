package com.corejava.basics;

public class IfStatement {

	public static void main(String[] args) {

		int n = 0;

		if (n == 0) {
			System.out.println("Even");
			System.out.println("Hiii");
		} else if (n % 2 == 0)
			System.out.println("Nothing");
		else
			System.out.println("Odd");
	}
}
