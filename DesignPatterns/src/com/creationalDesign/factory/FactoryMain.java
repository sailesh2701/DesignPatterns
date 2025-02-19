package com.creationalDesign.factory;

//Creational Design

public class FactoryMain {

	public static void main(String[] args) {

		// Normal Way of Implementing...!!
		Os os = new WindowsOs();
		System.out.println("Normal Way of using: ");
		os.perfomance();
		System.out.println("\n\nUsing factory Design: ");
		OperatingSystemLaunching osl = new OperatingSystemLaunching();
		Os get1 = osl.getInstance("open");
		get1.perfomance();
		Os get2 = osl.getInstance("closed");
		Os get3 = osl.getInstance("Windows");
		get2.perfomance();
		get3.perfomance();

	}

}
