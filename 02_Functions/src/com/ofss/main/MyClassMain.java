package com.ofss.main;

import java.util.Scanner;

import com.ofss.domain.MyClass;

public class MyClassMain {
	public static void main(String[] args) {
		System.out.println("main start");

		// accept num1 and num2 from user and pass to addition
		double numOne, numTwo, result;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Number1");
		numOne = scanner.nextDouble();
		System.out.println("Enter Number2");
		numTwo = scanner.nextDouble();

		MyClass myClass = new MyClass();
		result = myClass.addition(numOne, numTwo);

		System.out.println("Result is " + result);

		System.out.println("main end");
	}
}
