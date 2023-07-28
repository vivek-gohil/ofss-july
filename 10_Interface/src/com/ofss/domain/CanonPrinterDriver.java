package com.ofss.domain;

public class CanonPrinterDriver extends Driver implements CanonPrinter {
	@Override
	public void print() {
		System.out.println("Conon Printer Driver :: print code");
	}

	@Override
	public void wirelessPrinting() {
		System.out.println("Canon Printer is now able to print usign WIFI");
	}
}
