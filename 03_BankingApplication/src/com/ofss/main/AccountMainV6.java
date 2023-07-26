package com.ofss.main;

import com.ofss.domain.Current;

public class AccountMainV6 {
	public static void main(String[] args) {
		Current current = new Current(101, "Vivek Gohil", 10000, 50000);
		boolean result;
		System.out.println("withdraw : 5000");
		result = current.withdraw(5000);
		System.out.println("Result : " + result); // true
		System.out.println("Balance : " + current.getBalance()); //5000
		System.out.println("Balance : " + current.getOverdraftBalance()); //50000
		
		System.out.println();
		
		System.out.println("withdraw : 15000");
		result = current.withdraw(15000);
		System.out.println("Result : " + result); //true
		System.out.println("Balance : " + current.getBalance()); //0
		System.out.println("Balance : " + current.getOverdraftBalance());//40000

		System.out.println();
		
		System.out.println("deposit : 6000");
		result = current.deposit(6000);
		System.out.println("Result : " + result); //true
		System.out.println("Balance : " + current.getBalance()); //0
		System.out.println("Balance : " + current.getOverdraftBalance());//46000
		
		System.out.println();
		
		System.out.println("deposit : 10000");
		result = current.deposit(10000);
		System.out.println("Result : " + result); //true
		System.out.println("Balance : " + current.getBalance()); //6000
		System.out.println("Balance : " + current.getOverdraftBalance());//50000
		
		
	}
}
