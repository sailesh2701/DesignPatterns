package com.ObserverDesign;

//Behavioral Design Pattern
public class ObserverPatternMain {
	public static void main(String args[]) {
		/**
		 * The Observer Pattern is a behavioral design pattern where an object (Subject)
		 * maintains a list of dependents (Observers) and automatically notifies them of
		 * any state changes, ensuring a one-to-many dependency between objects.
		 **/
		WeatherStation weatherStation = new WeatherStation();

		Observer phoneDisplay = new PhoneDisplay();
		Observer webDisplay = new WebDisplay();

		weatherStation.registerObserver(phoneDisplay);
		weatherStation.registerObserver(webDisplay);

		System.out.println("Setting weather data: 30°C, 70% humidity, 1013 hPa");
		weatherStation.setMeasurements(30, 70, 1013);

		System.out.println("\nSetting weather data: 25°C, 60% humidity, 1009 hPa");
		weatherStation.setMeasurements(25, 60, 1009);
	}
}
