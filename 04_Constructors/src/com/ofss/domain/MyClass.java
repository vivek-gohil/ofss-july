package com.ofss.domain;

public class MyClass {
	private int x;

	public MyClass() {
		System.out.println("Default constructor of MyClass");
	}

	public MyClass(int x) {
		this.x = x;
		System.out.println("Parameterized constructor of MyClass");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
