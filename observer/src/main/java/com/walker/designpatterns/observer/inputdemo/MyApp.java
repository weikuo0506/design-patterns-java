package com.walker.designpatterns.observer.inputdemo;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by walker on 2016/11/2.
 */
public class MyApp {
    public static void main(String[] args) {
        EventSource eventSource = new EventSource();

        eventSource.addObserver(new Observer() {
            public void update(Observable o, Object arg) {
                System.out.println("接收到消息|arg=" + arg + "|observalbe=" + o);
            }
        });
        new Thread(eventSource).start();
    }
}
