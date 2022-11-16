package com.corejava.oops;

class K {

	int num1;
	int num2;
	int result;

	public K(int num1, int num2) {
		this.num1 = num1; 
		this.num2 = num2;
	}

}

public class ThisKeyword {

	public static void main(String[] args) {

		K obj = new K(4, 5);
		System.out.println(obj.num1);
		System.out.println(obj.num2);

	}

}
