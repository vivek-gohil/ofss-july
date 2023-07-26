package com.ofss.main;

import java.util.Scanner;

import com.ofss.domain.Account;
import com.ofss.domain.Current;
import com.ofss.domain.Savings;

public class AccountMainV8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = null;
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
			account = new Savings();
			break;
		case 2:
			account = new Current();
			break;
		}
		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);

		if (account instanceof Current) {
			System.out.println("Enter Overdraft Balance ");
			overdraftBalance = scanner.nextDouble();
			((Current) account).setOverdraftBalance(overdraftBalance);
		}
		if (account instanceof Savings) {
			System.out.println("Do you want to open salary account true or false");
			isSalary = scanner.nextBoolean();
			((Savings) account).setSalary(isSalary);
		}
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
				if (account instanceof Current) {
					System.out.println("Balance : " + account.getBalance());
					System.out.println("Overdraft Balance : " + ((Current) account).getOverdraftBalance());
				} else
					System.out.println("Balance : " + account.getBalance());
				break;
			default:
				System.out.println("Invalid Choice!!");
				break;
			}
			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));

	}
}
