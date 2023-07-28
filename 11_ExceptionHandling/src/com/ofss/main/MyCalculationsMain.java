package com.ofss.main;

import com.ofss.domain.MyCalculations;

public class MyCalculationsMain {
	public static void main(String[] args) {

		System.out.println("main start");

		MyCalculations myCalculations = new MyCalculations();
		myCalculations.accept();// exception
		myCalculations.calculate();
		myCalculations.display();

		System.out.println("main end");

	}
}
