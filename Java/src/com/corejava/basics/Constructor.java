package com.corejava.basics;

class A {
	int num1;
	int num2;
	int result;

	public A() {
		num1 = 5;
		num2 = 10;
	}

	public A(int B) {

		num1 = B;
		num2 = B;
	}

	public A(double d) {
		num1 = (int) d;
	}

	public A(int C, float D) {
		num1 = C;
		num2 = (int) D;
	}
}

public class Constructor {

	public static void main(String[] args) {

		A obj = new A(676, 87.98f); // Constructor

		System.out.println(obj.num1);
		System.out.println(obj.num2);

	}

}
