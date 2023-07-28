package com.ofss.domain;

public class HPPrinterDeriver extends Driver implements HPPrinter {
	@Override
	public void print() {
		System.out.println("HP Printer Driver :: print code");
	}
}
