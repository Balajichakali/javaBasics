package com.corejava.oops;

/* Final Key Word is used with
 * Variable --> we cannot change
 * Method --> no one can override it
 * class --> we cannot extends
 * 
 */

class F {

	final int I; //Constant it should have all Capital Letters

	public F() {
		 I=10;
		 
	}
}

public class FinalKeyword {

	public static void main(String[] args) {

		F obj = new F();
		System.out.println(obj.I);

	}

}
