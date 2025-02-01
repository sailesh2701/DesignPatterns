package com.strategyDesign;

public class PhonePay implements Payment {

	private String id;
	private String uName;

	public PhonePay(String id, String uName) {
		super();
		this.id = id;
		this.uName = uName;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Amount to pay throuhg Phone Pay: " + amount);
	}

}
