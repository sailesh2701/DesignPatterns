package com.adaptorDesign;

public class PrinterAdapter implements ModeratePrinter {

	private LegacyPrinter lp;

	public PrinterAdapter(LegacyPrinter lp) {
		this.lp = lp;// we can use setters also is needed...!
	}

	@Override
	public void printDocument(String st) {
		lp.print("Inside PrinterAdaptor -> " + st);
	}

}
