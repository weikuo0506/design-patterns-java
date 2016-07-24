package com.walker.designpatterns.observer.weatherstation.observer;

import com.walker.designpatterns.observer.weatherstation.display.DisplayElement;
import com.walker.designpatterns.observer.weatherstation.subject.Subject;

/**
 * Created by walker on 2016/7/24.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current Conditions: "+temperature + "| "+humidity);
    }

    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
