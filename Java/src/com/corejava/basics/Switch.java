package com.corejava.basics;

public class Switch {

	public static void main(String[] args) {

		String name = "wife";

		switch (name.toUpperCase()) {

		case "DAD":
			System.out.println("Srinivasulu");
			break;
		case "MOM":
			System.out.println("Uma Devi");
			break;
		case "WIFE":
			System.out.println("Neha Chakali");
			break;
		case "SON":
			System.out.println("Balaji Chakali");
			break;
		default:
			System.out.println("wrong entry");
			break;

		}

	}
}

/*
 * Format is not important break for last statement is optional
 */

/*
 * Float doesnot Supported switch char is Supported
 * 
 */
