package com.creationalDesign.singleTon;

public class SingleTonMain {

	public static void main(String[] args) {
		SingleTonObject s = SingleTonObject.getInstance();
		s.callSomething();

		SingleTonObject s1 = SingleTonObject.getInstance();
		s1.callSomething();
	}
}
