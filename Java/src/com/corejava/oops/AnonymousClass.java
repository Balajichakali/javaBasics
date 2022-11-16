package com.corejava.oops;

class N {
	public void show() {
		System.out.println("IN A");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		N obj = new N() {
			public void show() {
				System.out.println("In B");
			}
		};
		obj.show();

	}

}
