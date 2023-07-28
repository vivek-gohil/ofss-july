package com.ofss.main;

public class StringMain {
	public static void main(String[] args) {

		//Employee employee = 10 ,"Test" , 100;
		String message1 = "Hi"; // String pool will create new object and set value
		String message2 = new String("Hi"); // it will not create new object 
		String message3 = "Hi";

		System.out.println(message1);
		System.out.println(message1.hashCode());
		System.out.println(message2);
		System.out.println(message2.hashCode());
		System.out.println(message3);
		System.out.println(message3.hashCode());

		System.out.println("changing message1");
		message1 = message1 + " All";

		System.out.println(message1);
		System.out.println(message1.hashCode());
		System.out.println(message2);
		System.out.println(message2.hashCode());
		System.out.println(message3);
		System.out.println(message3.hashCode());

		//never compare string with ==
//		if (message2 == message3) {
//			System.out.println("Strings are same");
//		} else
//			System.out.println("Strings are different ");

		System.out.println();
		if (message2.equals(message3)) {
			System.out.println("Strings are same");
		} else
			System.out.println("Strings are different ");

	}
}
