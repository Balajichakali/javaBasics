package com.corejava.basics;

public class Variables {

	// Syntax:datatype var_name = value;

	/*
	 * Variable name can be combination of a-z,A-Z,0-9,$ and _ Variable should not
	 * start with numbers Variable can be changed
	 */

	public static void main(String[] args) {

		long l = 5l; // 8 bytes --> 64 bits
		int i = 5; // 4 bytes --> 32 bits --> -2,147,483,648 to 2,147,483,647
		short s = 5; // 2 bytes --> 16bits --> -32768 to 32767
		byte b = 5; // 1 byte --> 8bits --> -128 to 127

		i = 100;
		System.out.print(i);

		float percent1 = 5.5f; // 4 bytes
		double percent = 5.5; // default type for floating numbers 8 bytes , double supports integer val

		char c = 'A';
		c = 66;
		double d1 = 5; // implicit conversion
		int k = (int) 5.6; // type casting or explicit conversion

// byte --> short -->  int --> long --> float --> double		 

	}
}
