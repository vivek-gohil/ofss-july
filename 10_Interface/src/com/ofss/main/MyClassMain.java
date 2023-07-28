package com.ofss.main;

import com.ofss.domain.MyClass;
import com.ofss.domain.MyInterface;

public class MyClassMain {
	// MyInterface myInterface = new MyInterface();
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.show();

		System.out.println();

		MyInterface myInterface = new MyClass();
		myInterface.show();
	}

}
