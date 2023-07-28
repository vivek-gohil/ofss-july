package com.ofss.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalculations {
	private double numOne;
	private double numTwo;
	private double result;

	public void accept() {
		try {
			// accept two number using scanner
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Number 1 ");
			numOne = scanner.nextDouble();
			System.out.println("Enter Number 2 ");
			numTwo = scanner.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Invalid User Input!");
		} catch (Exception e) {
			System.out.println("Something wrong!");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("input completed!");
		}
	}

	public void calculate() {
		System.out.println("in calcuate");
		// division
		result = numOne / numTwo;
	}

	public void display() {
		System.out.println("Result : " + result);
	}
}
