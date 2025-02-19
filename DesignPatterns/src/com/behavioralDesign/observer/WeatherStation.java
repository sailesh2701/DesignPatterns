package com.behavioralDesign.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherStation() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}

	// Method to set new weather data
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers(); // Notify observers about the change
	}
}
