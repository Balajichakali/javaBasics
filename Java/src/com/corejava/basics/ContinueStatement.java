package com.corejava.basics;

public class ContinueStatement {

	public static void main(String[] args) {
		int val = 5;
		for (int i = 1; i <= 10; i++) {
			if (i == 5)
				continue; // skips the current iteration only
			System.out.println(i);
		}
	}
}
