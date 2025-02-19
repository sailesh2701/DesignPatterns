package com.creationalDesign.builder;

//Creational Design
public class PhonShop {

	public static void main(String[] args) {
		PhoneEntity ph = new PhoneEntity("Andriod", 12, "Qualcom", 12.4, 24000);
		System.out.println("Phone features: " + ph);

		PhoneEntity pb = new PhoneBuilder().setOs("Ios").setBattery(12500).setProcessor("M2").getNewPhone();
		System.out.println("New Phone features: " + pb);
	}

}
