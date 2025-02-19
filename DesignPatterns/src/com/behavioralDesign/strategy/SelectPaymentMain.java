package com.behavioralDesign.strategy;

import java.util.Scanner;

//Behaviour
public class SelectPaymentMain {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Select paymeny Mode \n1.Credit Card\n2.Gpay\n3.Phone Pay");
		int number = sc.nextInt();
		while (number > 3) {
			System.out.println("Please select valid number ");
			number = sc.nextInt();
		}
		sc.close();
		ShoppingCart cart;

		// From here we are using Factory Design but Strategy design is nothing but
		// using same interface by different classes

		// Where as factory design is creating method based on input..
		switch (number) {
		case 1: {
			cart = new ShoppingCart(new CreditCard(123456789101L, "Ksvs", 456, "23/28"));
			cart.checkOut(1000);
			break;
		}
		case 2: {
			cart = new ShoppingCart(new PhonePay("svs@ybl", "Sailesh"));
			cart.checkOut(1000);
			break;
		}
		case 3: {
			cart = new ShoppingCart(new Gpay("svs@ybl", "Sailesh"));
			cart.checkOut(1000);
			break;
		}
		default:
			System.out.println("Thank you.!!");
		}

	}
}
