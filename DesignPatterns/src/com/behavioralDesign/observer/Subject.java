package com.behavioralDesign.observer;

public interface Subject {

	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();
}
