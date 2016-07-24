package com.walker.designpatterns.observer.weatherstation.subject;

import com.walker.designpatterns.observer.weatherstation.observer.Observer;

/**
 * Created by walker on 2016/7/24.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
