package com.strategyDesign;

public class Gpay implements Payment {

	private String id;
	private String uName;

	public Gpay(String id, String uName) {
		super();
		this.id = id;
		this.uName = uName;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Amount to pay throuhg Gpay: " + amount);
	}

}
