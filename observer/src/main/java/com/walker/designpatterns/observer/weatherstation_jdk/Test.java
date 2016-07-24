package com.walker.designpatterns.observer.weatherstation_jdk;

import com.walker.designpatterns.observer.weatherstation_jdk.observer.CurrentConditionsDisplay;
import com.walker.designpatterns.observer.weatherstation_jdk.observer.ForecastDisplay;
import com.walker.designpatterns.observer.weatherstation_jdk.subject.WeatherData;

/**
 * Created by walker on 2016/7/24.
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);


        weatherData.setMeasurements(100,50);
        weatherData.setMeasurements(200,100);

    }
}
