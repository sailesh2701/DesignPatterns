package com.strategyDesign;

public class CreditCard implements Payment {

	private long cardNumber;
	private String cardHolder;
	private int cvv;
	private String expiryDate;

	public CreditCard(long cardNumber, String cardHolder, int cvv, String expiryDate) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolder = cardHolder;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Amount to pay throuhg credit card: " + amount);

	}

}
