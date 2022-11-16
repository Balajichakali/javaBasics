package com.corejava.oops;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			int arr[] = new int[6];
			arr[2] = 3;
			int i = 7;
			int j = 0;
			int k = i / j;
			System.out.println("Output is " + k);
		}

		catch (ArithmeticException e) {
			System.out.println("Cannot divide by Zero... ");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Stay in your limits... ");
		}

		catch (Exception e) {
			System.out.println("Something went wrong...");
		}

		finally {
			System.out.println("All resources are closed");
		}

	}

}
