package com.ofss.main;

import com.ofss.domain.MyClass;

public class MyClassMain {
	public static void main(String[] args) {

		// MyClass.display(); //static method can be called without creating object.
		// class name as reference.
		System.out.println("main start");

		// static block will get called at the time of class loading into JVM

		// how/when the class will loaded in memory
		// 1. While creating object
		// 2. Calling any static method with class name
		// 3. Manual class loading

		try {
			Class.forName("com.ofss.domain.MyClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//		MyClass myClass = new MyClass();
//		myClass.show();

		System.out.println("main end");
	}
}
