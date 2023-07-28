package com.ofss.main;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];

		// sort the data of array in asc order
		System.out.println("Enter 5 elements of array");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		Arrays.sort(numbers);

		System.out.println("Values");
		for (int i : numbers) {
			System.out.println(i);
		}

//		numbers[0] = 10;
//		numbers[1] = 20;
//		numbers[2] = 30;
//		numbers[3] = 40;
//		numbers[4] = 50;

//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);

	}
}
