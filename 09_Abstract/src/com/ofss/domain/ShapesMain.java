package com.ofss.domain;

import java.util.Scanner;

public class ShapesMain {
	public static void main(String[] args) {
		// polymorphism
		// Shapes shapes = new Shapes();

		// Menu
		// 1 . Draw Circle
		// 2 . Draw Line
		// 3 . Draw Rectangle
		// choice
		// as per user choice draw the shape.
		Scanner scanner = new Scanner(System.in);
		Shapes shapes = null;
		int choice;

		System.out.println("Menu");
		System.out.println("1. Draw Circle");
		System.out.println("2. Draw Line");
		System.out.println("3. Draw Rectangle");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Circle is selected");
			shapes = new Circle();
			break;
		case 2:
			System.out.println("Line is selected");
			shapes = new Line();
			break;
		case 3:
			System.out.println("Ractangle is selected");
			shapes = new Rectangle();
			break;
		default:
			System.out.println("invalid choice");
			break;
		}

		if (choice > 1 && choice < 4)
			shapes.draw();
	}
}
