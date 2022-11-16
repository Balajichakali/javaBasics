package com.corejava.oops;

class A {
	public void show() {
		System.out.println("A");
	}
}

class B extends A {
	@Override
	public void show() {
		super.show();
		System.out.println("B");
	}

}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj1 = new B();
		obj1.show();

	}

}
