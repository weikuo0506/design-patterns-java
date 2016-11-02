package com.walker.designpatterns.observer.inputdemo;

import java.util.Observable;
import java.util.Scanner;

/**
 * Created by walker on 2016/11/2.
 */
public class EventSource extends Observable implements Runnable {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String inuput = scanner.next();
            setChanged();
            notifyObservers(inuput);
        }
    }
}
