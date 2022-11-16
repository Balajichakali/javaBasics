package com.corejava.basics;

class Math {

	public int add(int... n) {
		int sum = 0;
		for (int i : n) {
			sum = sum + i;
		}
		return sum;
	}
}

public class Varargs {

	public static void main(String[] args) {

		Math obj = new Math();
		System.out.println(obj.add(100, 200, 300, 400, 500));
	}
}
