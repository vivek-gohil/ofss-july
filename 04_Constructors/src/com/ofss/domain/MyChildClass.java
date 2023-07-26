package com.ofss.domain;

public class MyChildClass extends MyClass {
	private String y;

	public MyChildClass() {
		System.out.println("Default constructor of MyChildClass");
	}

	public MyChildClass(String y,int x) {
		super(x);
		this.y = y;
		System.out.println("Parameterized constructor of MyChildClass");
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

}
