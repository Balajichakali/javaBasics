package com.corejava.oops;

interface writer {
	void write();

}

class pen implements writer {
	public void write() {
		System.out.println("In Pen");
	}
}

class pencil implements writer {
	public void write() {
		System.out.println("In Pencil");
	}
}

class kit {
	public void doSomethig(writer p) {
		p.write();
	}

}

public class Interface {

	public static void main(String[] args) {
		

		kit k = new kit();
		writer p = new pen();
		writer pc = new pencil();

		k.doSomethig(p);

	}

}
