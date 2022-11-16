package com.corejava.basics;

class Casio {

	int num1;
	int num2;
	String operation;

	public Casio() {
		num1 = 0;
		num2 = 0;
		operation = "Nothing";
	}

	public Casio(int i) {
		num1 = i;
		num2 = 0;
		operation = "Nothing";
	}

	public Casio(int i, int j) {
		num1 = i;
		num2 = j;
		operation = "Nothing";
	}

	public Casio(int i, int j, String op) {
		num1 = i;
		num2 = j;
		operation = op;
	}

	/*
	 * public void add(int i,int j) { System.out.println(i+j); }
	 * 
	 * public void add(int i,int j,int k) { System.out.println(i+j+k); }
	 * 
	 * public void add(double i,double j) { System.out.println(i+j); }
	 */

}

public class MethodAndConstructorOverloading {

	public static void main(String[] args) {

		Casio obj = new Casio(8, 9, "Bala");

		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.operation);

		/*
		 * obj.add(5, 3);
		 * 
		 * obj.add(4,3,6);
		 * 
		 * obj.add(4.5,4.9);
		 */

	}

	
}
