package com.ofss.domain;

public class MyClass {
	private static int num1 = 10;
	private static int num2 = 10;

	public MyClass() {
		System.out.println("default constructor of MyClass");
	}

	{
		System.out.println("non-static block");
	}

	static {
		System.out.println("static block");
	}

	public void show() {
		System.out.println("show() of MyClass");
	}

	public static void display() {
		System.out.println("static " + num1);
		System.out.println("static " + num2);
		num1++;
		num2++; // static method contains only static variables.
		System.out.println("static " + num1);
		System.out.println("static " + num2);
	}
}
