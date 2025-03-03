package com.structuralDesign.facade;

public class SmartHouse {
	private Light light;
	private AirConditioner ac;
	private Television tv;
	private MusicSystem music;

	public SmartHouse() {
		this.light = new Light();
		this.ac = new AirConditioner();
		this.tv = new Television();
		this.music = new MusicSystem();
	}

	// Simplified operation
	void watchMovie() {
		System.out.println("\nActivating Movie Mode...");
		light.turnOff();
		ac.turnOn();
		tv.turnOn();
		music.turnOn();
		System.out.println("Movie Mode Activated!\n");
	}

	void stopMovie() {
		System.out.println("\nStopping Movie Mode...");
		light.turnOn();
		ac.turnOff();
		tv.turnOff();
		music.turnOff();
		System.out.println("Movie Mode Deactivated!\n");
	}
}
