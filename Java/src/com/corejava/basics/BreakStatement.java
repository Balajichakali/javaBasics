package com.corejava.basics;

public class BreakStatement {

	public static void main(String[] args) {
		int val = 5;
		for (int i = 1; i <= 10; i++) {
			if (i == val)
				break; // breaks the entire loop
			System.out.println(i);
		}
	}
}
