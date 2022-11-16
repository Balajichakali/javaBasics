package com.corejava.oops;

// Types of Interfaces

@FunctionalInterface
interface Abc {
	void show();

}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abc obj = () -> System.out.println("In Balaji"); // Lambda Expression

		obj.show();
	}

}
