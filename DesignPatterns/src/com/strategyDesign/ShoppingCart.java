package com.strategyDesign;

public class ShoppingCart {

	private Payment payment;

	public ShoppingCart(Payment payment) {
		super();
		this.payment = payment;
	}

	public void checkOut(int amount) {
		payment.pay(amount);
	}

}
