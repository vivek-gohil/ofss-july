package com.ofss.main;

import com.ofss.domain.Account;

public class AccountMainV2 {
	public static void main(String[] args) {
		System.out.println("We are in AccountMainV2");

		boolean result;
		// create account object and set values
		Account account = new Account();
		account.setAccountNumber(101);
		account.setName("Vivek Gohil");
		account.setBalance(1000);

		System.out.println("withdraw : 300");
		result = account.withdraw(300);
		if (result) {
			System.out.println("Withdraw successfull");
			System.out.println("Balance : " + account.getBalance());
		} else {
			System.out.println("Withdraw failed");
			System.out.println("Balance : " + account.getBalance());
		}

		System.out.println("deposit : 500");
		result = account.deposit(500);
		if (result) {
			System.out.println("Deposit successfull");
			System.out.println("Balance : " + account.getBalance());
		} else {
			System.out.println("Deposit failed");
			System.out.println("Balance : " + account.getBalance());
		}

	}
}
