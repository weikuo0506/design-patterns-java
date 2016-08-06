package com.walker.designpatterns.iterator.wild;

import com.walker.designpatterns.iterator.wild.menu.DinerMenu;
import com.walker.designpatterns.iterator.wild.menu.PancakeMenu;

/**
 * Created by walker on 2016/8/6.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new PancakeMenu(), new DinerMenu());
        waitress.printMenu();
    }
}
