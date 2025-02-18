package com.ObserverDesign;

public class WebDisplay implements Observer {
	private float temperature;
	private float pressure;

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.pressure = pressure;
		display();
	}

	public void display() {
		System.out.println("Web Display - Temperature: " + temperature + "°C, Pressure: " + pressure + " hPa");
	}
}
