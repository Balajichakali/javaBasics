package com.corejava.basics;

public class TernaryOperator {

//syntax --> ?:|condition?expr1:expr2;

	public static void main(String[] args) {

		int i = 10;
		int j = 5;

		/*
		 * if(i>j){ j=20; }else{ j=40; }
		 */

		int k = i > j ? 20 : 40;
		System.out.println(k);

	}

}
