package com.ofss.main;

import java.util.Scanner;

import com.ofss.domain.Account;
import com.ofss.domain.Savings;

public class AccountMainV5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		int choice;
		double amount;
		boolean result;
		boolean isSalary;
		String continueChoice;

		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		System.out.println("Do you want to open salary account true-false");
		isSalary = scanner.nextBoolean();

		Savings account = new Savings(accountNumber, name, balance, isSalary);
		System.out.println("Account opened successfully!");
		do {

			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter amount to withdraw");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);
				if (result)
					System.out.println("Withdraw Successfull!");
				else
					System.out.println("Withdraw Failed");
				break;
			case 2:
				System.out.println("Enter amount to deposit");
				amount = scanner.nextDouble();
				result = account.deposit(amount);
				if (result)
					System.out.println("Deposit Successfull!");
				else
					System.out.println("Deposit Failed");
				break;
			case 3:
				System.out.println("Balance : " + account.getBalance());
				break;
			default:
				System.out.println("Invalid Choice!!");
				break;
			}
			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));
		System.out.println("Thank you!");

	}
}
