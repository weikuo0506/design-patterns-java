package com.walker.designpatterns.observer.weatherstation.subject;

import com.walker.designpatterns.observer.weatherstation.observer.Observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by walker on 2016/7/24.
 */
public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private Set<Observer> observers;

    public WeatherData() {
        observers = new HashSet<Observer>();
    }
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature,humidity);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();
    }

    public Set<Observer> getObservers() {
        return observers;
    }
}
