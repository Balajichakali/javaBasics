package com.corejava.basics;

public class Arrays {

	public static void main(String[] args) {

		/*
		 * int nums[]= {9,15,38,56}; nums[0]=9; nums[1]=15; nums[2]=38; nums[3]=56;
		 * nums[3]=65; System.out.println(nums[1 ]); for(int i=0;i<4;i++) {
		 * System.out.println(nums[i]);
		 * 
		 * }
		 */

		int a[] = { 1, 2, 3, 4 };
		for (int k : a) { // Enhanced for loop 1D Array
			System.out.println(k);
		}
		int b[] = { 5, 6, 7, 8 };
		int c[] = { 9, 1, 2, 3 };

		int d[][] = {

				{ 1, 2, 3, 4 }, // Jagged Array
				{ 5, 6, 7 }, { 9, 1, 2, 3, 4, 5, 6 } };

		for (int i = 0; i < d.length; i++) { // --> C ounts Row
			for (int j = 0; j < d[i].length; j++) { // --> Counts Column
				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}

		for (int k[] : d) { // Enhanced for loop 2D Array
			for (int l : k) {
				System.out.print(" " + l);
			}
			System.out.println();
		}

	}
}
