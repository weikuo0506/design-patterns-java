package com.walker.designpatterns.observer.weatherstation_jdk.subject;


import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

/**
 * Created by walker on 2016/7/24.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;

    public void measurementsChanged() {
        setChanged();
        notifyObservers("weather");
    }

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }
}
