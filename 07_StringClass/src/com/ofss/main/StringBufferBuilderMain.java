package com.ofss.main;

public class StringBufferBuilderMain {
	public static void main(String[] args) {

		String message1 = "hi";
		StringBuffer message2 = new StringBuffer("hi");
		StringBuilder message3 = new StringBuilder("hi");

		System.out.println("string message1=" + message1);
		System.out.println("string message1 hashcode=" + message1.hashCode());

		System.out.println();

		System.out.println("stringbuffer message2=" + message2);
		System.out.println("stringbuffer message2 hashcode=" + message2.hashCode());

		System.out.println();

		System.out.println("stringbuilder message3=" + message3);
		System.out.println("stringbuilder message3 hashcode=" + message3.hashCode());

		message1 = message1.concat(" hello");
		message2.append(" hello");
		message3.append(" hello");
		System.out.println();

		System.out.println("string message1=" + message1);
		System.out.println("string message1 hashcode=" + message1.hashCode());

		System.out.println();

		System.out.println("stringbuffer message2=" + message2);
		System.out.println("stringbuffer message2 hashcode=" + message2.hashCode());

		System.out.println();

		System.out.println("stringbuilder message3=" + message3);
		System.out.println("stringbuilder message3 hashcode=" + message3.hashCode());

	}
}
