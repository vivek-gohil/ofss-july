package com.ofss.main;

import com.ofss.domain.Account;

public class AccountMain {
	public static void main(String[] args) {
		// set the value of account number , name and balance variable.

		Account account = new Account();
		account.setAccountNumber(101);
		account.setName("Vivek Gohil");
		account.setBalance(1000);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		
		System.out.println();
		
		Account account2 = new Account();
		account2.setAccountNumber(102);
		account2.setName("Ravi");
		account2.setBalance(1000);
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());
	}
}
