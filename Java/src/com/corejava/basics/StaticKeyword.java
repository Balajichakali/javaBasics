package com.corejava.basics;

class Emp {
	int empid;
	int salary;
	static String ceo; // same for all objects irrespective of particular object using

	static { // executed when you load a class|class load once
		ceo = "Veerendra";
		// System.out.println("Static block");
	}

	public Emp() { // gets executed when you create an object
		empid = 1;
		salary = 3000;
		// System.out.println("Constructor block");
	}

	public void show() {
		System.out.println(empid + " : " + salary + " : " + ceo);
	}
}

public class StaticKeyword {

	public static void main(String[] args) {

		Emp Balaji = new Emp();

		/*
		 * Balaji.empid=8; Balaji.salary=4000; Emp.ceo="Munna";
		 */

		Emp Goud = new Emp();

		/*
		 * Goud.empid=9; Goud.salary=5000; Emp.ceo="Munna"; //we dont need object
		 * 
		 * Emp.ceo="Prasad";
		 */

		Balaji.show();
		Goud.show();
	}

}
