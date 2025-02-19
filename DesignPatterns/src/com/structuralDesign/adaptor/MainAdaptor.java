package com.structuralDesign.adaptor;

//Structural
public class MainAdaptor {

	public static void main(String[] args) {

		LegacyPrinter lp = new LegacyPrinter();
		ModeratePrinter mp = new PrinterAdapter(lp);
		mp.printDocument("{[Print this Document]}");

		// Adaptor Design is used to allow other classes implement through Adaptor class
		// Where Adaptor class will act like a mediator

		/**
		 * Simple UnderStanding:
		 * 
		 * Let's say we Have Classes A and B and objects are created in MAin Class.
		 * 
		 * Now we Need to call methodInA using Class "B" where methodInA is not there in
		 * B.
		 * 
		 * So we will create object of A in Class B. we can create a setter for that Or
		 * we can assign through constructor as well.
		 * 
		 * Class B{ private A a;
		 * 
		 * public B(A a){ this.a=a } (Or) public void setA(A a){ this.a=a; }
		 * 
		 * public void someRandomMethodInB(){ a.MethodInA(); }
		 * 
		 * 
		 * }
		 * 
		 * Now IN Main method where A and B objects created We can call methodInA using
		 * someRandomMethodInB
		 * 
		 * 
		 * 
		 * 
		 **/

	}

}
