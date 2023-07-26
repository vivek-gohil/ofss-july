package com.ofss.main;

import com.ofss.domain.Account;

public class AccountMainV4 {
	public static void main(String[] args) {
		// create two constructors in account class
		// default constructor
		// param constructor - three param

		// in main
		// 1. create object and call the default constructor of account
		// set all values and print all values
		Account account = new Account();
		account.setAccountNumber(101);
		account.setName("Vivek Gohil");
		account.setBalance(1000);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());

		System.out.println();

		// 2. create object and call param constructor and pass values
		// print all values
		Account account2 = new Account(102, "Ravi", 1000);
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());

	}
}
