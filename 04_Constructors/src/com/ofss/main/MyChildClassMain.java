package com.ofss.main;

import com.ofss.domain.MyChildClass;

public class MyChildClassMain {
	public static void main(String[] args) {
		// MyChildClass childClass = new MyChildClass();
		MyChildClass childClass = new MyChildClass("Hi", 10);
		System.out.println(childClass.getX());
		System.out.println(childClass.getY());
	}
}
