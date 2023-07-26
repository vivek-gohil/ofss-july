package com.ofss.main;

import com.ofss.domain.MyClass;

public class MyClassMain {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.setX(10);
		System.out.println(myClass.getX());
		System.out.println("-----------------");
		MyClass myClass2 = new MyClass(10);
		System.out.println(myClass2.getX());
		
	}
}
