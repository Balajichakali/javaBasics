package com.corejava.basics;

class calc {
	int num1;
	int num2;
	int result;

	public void perform() {
		result = num1 * num2;
	}
}

public class ClassesAndObjects {

// To Build any object jvm needs class
// Class:Defines the structure of an object and working of an object

	public static void main(String[] args) {

		calc obj = new calc(); // object--> Knows something & Does something
		obj.num1 = 5;
		obj.num2 = 5;

		obj.perform();

		System.out.println(obj.result);
	}

}

