package com.walker.designpatterns.observer.weatherstation_jdk.observer;

import com.walker.designpatterns.observer.weatherstation_jdk.display.DisplayElement;
import com.walker.designpatterns.observer.weatherstation_jdk.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by walker on 2016/7/24.
 */
public class ForecastDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Observable weatherData;

    public ForecastDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void display() {
        System.out.println("forcast : "+ temperature +" | "+ humidity);
    }


    public void update(Observable o, Object arg) {
        System.out.println("receive msg : "+ arg);
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
