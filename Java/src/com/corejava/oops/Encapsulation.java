package com.corejava.oops;

//Encapsulation-->Binding data with methods

class Student {
	private int rollno;
	private String name;

	// Getters--> To Get the Values, Setters-->To set the Values

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();

		s1.setRollno(5);
		s1.setName("Balaji");
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
	}

}
