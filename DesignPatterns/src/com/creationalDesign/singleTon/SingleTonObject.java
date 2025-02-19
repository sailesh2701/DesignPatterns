package com.creationalDesign.singleTon;

public class SingleTonObject {
	private static SingleTonObject instance = null;
	private static int i = 0;

	private SingleTonObject() {
		System.out.println("Hey.!! Inside Object..!!!");
	}

	public static synchronized SingleTonObject getInstance() {
		if (instance == null) {
			System.out.println("Object not created. Creating now..!");
			instance = new SingleTonObject();
			return instance;
		}
		System.out.println("Already Object is Created..!! ");
		return instance;
	}

	public void callSomething() {
		i = i + 1;
		System.out.println("Value of i is: "+i);
	}
}
