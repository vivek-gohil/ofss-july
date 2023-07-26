package com.ofss.main;

import java.util.Scanner;

import com.ofss.domain.Account;
import com.ofss.domain.Current;
import com.ofss.domain.Savings;

public class AccountMainV7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		boolean isSalary;
		double overdraftBalance;
		int choice;
		double amount;
		boolean result;
		String continueChoice;
		int accountChoice;

		System.out.println("Account Menu");
		System.out.println("1. Savgins ");
		System.out.println("2. Current ");
		System.out.println("Enter your account choice");
		accountChoice = scanner.nextInt();
		switch (accountChoice) {
		case 1:
			System.out.println("Enter Account Number");
			accountNumber = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Name");
			name = scanner.nextLine();
			System.out.println("Enter Balance");
			balance = scanner.nextDouble();
			System.out.println("Do you want to open salary account");
			isSalary = scanner.nextBoolean();
			Savings savings = new Savings(accountNumber, name, balance, isSalary);

			do {
				System.out.println("Account opened successfully!");
				System.out.println("Menu");
				System.out.println("1. Withdraw");
				System.out.println("2. Deposit");
				System.out.println("3. Check Balance");
				choice = scanner.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Enter amount to withdraw");
					amount = scanner.nextDouble();
					result = savings.withdraw(amount);
					if (result)
						System.out.println("Withdraw Successfull!");
					else
						System.out.println("Withdraw Failed");
					break;
				case 2:
					System.out.println("Enter amount to deposit");
					amount = scanner.nextDouble();
					result = savings.deposit(amount);
					if (result)
						System.out.println("Deposit Successfull!");
					else
						System.out.println("Deposit Failed");
					break;
				case 3:
					System.out.println("Balance : " + savings.getBalance());
					break;
				default:
					System.out.println("Invalid Choice!!");
					break;
				}
				System.out.println("Do you want to continue?");
				continueChoice = scanner.next();
			} while (continueChoice.equals("yes"));
			break;
		case 2:
			System.out.println("Enter Account Number");
			accountNumber = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Name");
			name = scanner.nextLine();
			System.out.println("Enter Balance");
			balance = scanner.nextDouble();
			System.out.println("Please enter overdraft balance");
			overdraftBalance = scanner.nextDouble();
			Current current = new Current(accountNumber, name, balance, overdraftBalance);

			do {
				System.out.println("Account opened successfully!");
				System.out.println("Menu");
				System.out.println("1. Withdraw");
				System.out.println("2. Deposit");
				System.out.println("3. Check Balance");
				choice = scanner.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Enter amount to withdraw");
					amount = scanner.nextDouble();
					result = current.withdraw(amount);
					if (result)
						System.out.println("Withdraw Successfull!");
					else
						System.out.println("Withdraw Failed");
					break;
				case 2:
					System.out.println("Enter amount to deposit");
					amount = scanner.nextDouble();
					result = current.deposit(amount);
					if (result)
						System.out.println("Deposit Successfull!");
					else
						System.out.println("Deposit Failed");
					break;
				case 3:
					System.out.println("Balance : " + current.getBalance());
					System.out.println("Overdraft Balance : " + current.getOverdraftBalance());
					break;
				default:
					System.out.println("Invalid Choice!!");
					break;
				}
				System.out.println("Do you want to continue?");
				continueChoice = scanner.next();
			} while (continueChoice.equals("yes"));
			break;
		default:
			System.out.println("Invalid Choice");
			break;

		}
		System.out.println("Thank you!");
	}
}
