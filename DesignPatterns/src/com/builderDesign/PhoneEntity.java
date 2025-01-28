package com.builderDesign;

public class PhoneEntity {

	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;

	public PhoneEntity(String os, int ram, String processor, double screenSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "PhoneEntity [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}
	
	

}
