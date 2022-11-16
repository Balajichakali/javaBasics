package com.corejava.oops;

abstract class Human // abstract class
{
	public abstract void eat();

	public void sleep() {

	}
}

class Man extends Human // Concrete class
{
	public void eat() {

	}
}

public class Abstraction {

	public static void main(String[] args) {

		Human obj = new Man();
	}

}
