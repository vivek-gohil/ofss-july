package com.ofss.main;

import java.util.Scanner;

import com.ofss.domain.Account;

public class AccountMainV3 {
	public static void main(String[] args) {
		// accept accountnumber,name,balance from user and set into account object.
		// print menu
		// 1. Withdraw
		// 2. Deposit
		// 3. Display Balance
		// Enter your choice
		// transaction as per choice and display transaction status
		// Do you want to continue ? yes or no in case of yes print menu again
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		int choice;
		double amount;
		boolean result;
		String continueChoice;

		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);

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
