package com.ofss.domain;

public class EpsonPrinterDriver extends Driver implements EpsonPrinter {
	@Override
	public void print() {
		System.out.println("Epson Printer Driver :: print code");
	}

	@Override
	public void wirelessPrinting() {
		System.out.println("Canon Printer is now able to print usign WIFI");
	}
}
